package com.tingyun.classes;

import com.tingyun.threadlocal.MyThreadLocal;
import com.tingyun.util.ActionTraceDataUtil;

public class SecondClass {

	public String secondClassMethod001(String param) {
		String methodName = Thread.currentThread().getStackTrace()[1].getClassName()+"."+Thread.currentThread().getStackTrace()[1].getMethodName();
		String parentMethodName = Thread.currentThread().getStackTrace()[2].getClassName()+"."+Thread.currentThread().getStackTrace()[2].getMethodName();
		ActionTraceDataUtil.createActionTrace(this.getClass(), MyThreadLocal.threadLocal,methodName,parentMethodName);
		
		return param;
	}
	
	public String secondClassMethod002(String param) {
		String methodName = Thread.currentThread().getStackTrace()[1].getClassName()+"."+Thread.currentThread().getStackTrace()[1].getMethodName();
		String parentMethodName = Thread.currentThread().getStackTrace()[2].getClassName()+"."+Thread.currentThread().getStackTrace()[2].getMethodName();
		ActionTraceDataUtil.createActionTrace(this.getClass(), MyThreadLocal.threadLocal,methodName,parentMethodName);
		return param;
	}
	
	public String secondClassMethod003(String param) {
		String methodName = Thread.currentThread().getStackTrace()[1].getClassName()+"."+Thread.currentThread().getStackTrace()[1].getMethodName();
		String parentMethodName = Thread.currentThread().getStackTrace()[2].getClassName()+"."+Thread.currentThread().getStackTrace()[2].getMethodName();
		ActionTraceDataUtil.createActionTrace(this.getClass(), MyThreadLocal.threadLocal,methodName,parentMethodName);

		return param;
	}
}
