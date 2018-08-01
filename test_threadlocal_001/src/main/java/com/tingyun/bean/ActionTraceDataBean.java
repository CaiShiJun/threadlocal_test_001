package com.tingyun.bean;

import java.util.ArrayList;
import java.util.List;

public class ActionTraceDataBean {
	
	//
	private String id;

	// ���뷽��ʱ��
	private long entrytime;

	// ����
	private String className;

	// ������
	private String methodName;

	// ��ǰ��ջ��Ϣ
	private String stackTracesMessage;

	// �ӽڵ�
	private List<ActionTraceDataBean> ActionTraceDataList = new ArrayList<ActionTraceDataBean>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getEntrytime() {
		return entrytime;
	}

	public void setEntrytime(long entrytime) {
		this.entrytime = entrytime;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getStackTracesMessage() {
		return stackTracesMessage;
	}

	public void setStackTracesMessage(String stackTracesMessage) {
		this.stackTracesMessage = stackTracesMessage;
	}

	public List<ActionTraceDataBean> getActionTraceDataList() {
		return ActionTraceDataList;
	}

	public void setActionTraceDataList(List<ActionTraceDataBean> actionTraceDataList) {
		ActionTraceDataList = actionTraceDataList;
	}

	@Override
	public String toString() {
		return "ActionTraceDataBean [id=" + id + ", entrytime=" + entrytime + ", className=" + className + ", methodName=" + methodName + ", stackTracesMessage=" + stackTracesMessage + ", ActionTraceDataList=" + ActionTraceDataList + "]";
	}
	
}
