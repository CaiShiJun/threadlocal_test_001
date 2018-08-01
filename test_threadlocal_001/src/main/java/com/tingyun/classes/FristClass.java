package com.tingyun.classes;

import com.tingyun.threadlocal.MyThreadLocal;
import com.tingyun.util.ActionTraceDataUtil;

public class FristClass {
	
	public String fristClassMethod001(String param) {
		String methodName = Thread.currentThread().getStackTrace()[1].getClassName()+"."+Thread.currentThread().getStackTrace()[1].getMethodName();
		String parentMethodName = Thread.currentThread().getStackTrace()[2].getClassName()+"."+Thread.currentThread().getStackTrace()[2].getMethodName();
		ActionTraceDataUtil.createActionTrace(this.getClass(), MyThreadLocal.threadLocal,methodName,parentMethodName);
		
		return param;
	}
	
	public String fristClassMethod002(String param) {
		String methodName = Thread.currentThread().getStackTrace()[1].getClassName()+"."+Thread.currentThread().getStackTrace()[1].getMethodName();
		String parentMethodName = Thread.currentThread().getStackTrace()[2].getClassName()+"."+Thread.currentThread().getStackTrace()[2].getMethodName();
		ActionTraceDataUtil.createActionTrace(this.getClass(), MyThreadLocal.threadLocal,methodName,parentMethodName);
		
		fristClassMethod001(param);
		
		return param;
	}
	
	public String fristClassMethod003(String param) {
		String methodName = Thread.currentThread().getStackTrace()[1].getClassName()+"."+Thread.currentThread().getStackTrace()[1].getMethodName();
		String parentMethodName = Thread.currentThread().getStackTrace()[2].getClassName()+"."+Thread.currentThread().getStackTrace()[2].getMethodName();
		ActionTraceDataUtil.createActionTrace(this.getClass(), MyThreadLocal.threadLocal,methodName,parentMethodName);
		
		fristClassMethod002(param);
		
		SecondClass secondClass = new SecondClass();
		secondClass.secondClassMethod001(param);
		
		ThreeClass threeClass = new ThreeClass();
		threeClass.threeClassMethod002(param);
		
		return param;
	}
	
	

	
	


}
