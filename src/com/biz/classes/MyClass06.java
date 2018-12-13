package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass06 {
	List<String> strList;
	public MyClass06() {
		strList = new ArrayList();
	}
	public void push(int num) {
		strList.add(String.valueOf(num));
	}
	public String show() {
		String st = "";
		for(String s: strList) {
			st += s ;
		}return st;
	}
	

}
