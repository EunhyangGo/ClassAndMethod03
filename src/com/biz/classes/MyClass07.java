package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass07 {
 
	String[] st2; // 배열 선언
	public MyClass07() {
		
	
} public void insert(String st) {
	st2 = st.split(""); // 배열 선언후 split으로 문자열을 자름 


} public void show() {
	for(String s : st2) {
		System.out.print(s+",");	
	}
	System.out.println();
	

}
}
