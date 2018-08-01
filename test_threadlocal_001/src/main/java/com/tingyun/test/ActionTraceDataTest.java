package com.tingyun.test;

import com.tingyun.classes.FristClass;
import com.tingyun.threadlocal.MyThreadLocal;

import net.sf.json.JSONObject;

public class ActionTraceDataTest {

	public static void main(String[] args) {
		
		FristClass fristClass = new FristClass();
		
		fristClass.fristClassMethod003("1121");
		
		JSONObject jsonObject = JSONObject.fromObject(MyThreadLocal.threadLocal.get());
		System.out.println(jsonObject.toString());
	}
	
}
