package com.tingyun.util;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.tingyun.bean.ActionTraceDataBean;

public class ActionTraceDataUtil {

	public static String createActionTrace(Class clazz, ThreadLocal threadLocal, String methodName, String parentMethodName) {

		UUID uid = UUID.randomUUID();
		String actionMethodId = uid.toString();

		if (null == threadLocal.get()) {
			ActionTraceDataBean actionTraceDataBean = new ActionTraceDataBean();
			actionTraceDataBean.setId(actionMethodId);
			actionTraceDataBean.setEntrytime(new Date().getTime());
			actionTraceDataBean.setClassName(clazz.getName());
			actionTraceDataBean.setMethodName(methodName);

			threadLocal.set(actionTraceDataBean);
		} else if (threadLocal.get() instanceof ActionTraceDataBean) {
			ActionTraceDataBean actionTraceDataBean = (ActionTraceDataBean) threadLocal.get();

			ActionTraceDataBean newActionTraceDataBean = new ActionTraceDataBean();
			newActionTraceDataBean.setId(actionMethodId);
			newActionTraceDataBean.setEntrytime(new Date().getTime());
			newActionTraceDataBean.setClassName(clazz.getName());
			newActionTraceDataBean.setMethodName(methodName);

			ActionTraceDataBean newActionTraceDataParentNodeBean = findParentNode(actionTraceDataBean,parentMethodName);
			newActionTraceDataParentNodeBean.getActionTraceDataList().add(newActionTraceDataBean);

			threadLocal.set(actionTraceDataBean);
		}

		return actionMethodId;

	}

	public static ActionTraceDataBean findParentNode(ActionTraceDataBean actionTraceDataBean, String parentMethodName) {
		if (actionTraceDataBean != null) {
			if (actionTraceDataBean.getMethodName().equals(parentMethodName)) {
				return actionTraceDataBean;
			} else if (actionTraceDataBean.getActionTraceDataList().size() != 0) {
				for (ActionTraceDataBean ac : actionTraceDataBean.getActionTraceDataList()) {
						return findParentNode(ac, parentMethodName);
				}
			}
		}
		return null;
	}

}
