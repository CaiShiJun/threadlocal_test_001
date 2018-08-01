package com.tingyun.bean;

import java.util.ArrayList;
import java.util.List;

public class ActionTraceDataBean {
	
	//
	private String id;

	// 进入方法时间
	private long entrytime;

	// 类名
	private String className;

	// 方法名
	private String methodName;

	// 当前堆栈信息
	private String stackTracesMessage;

	// 子节点
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
