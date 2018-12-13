package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass02 {
	List<Integer> intList;
	
	
	public MyClass02() {
		intList = new ArrayList();
	}
	public void push(int num) {
	
		intList.add(num); // 아무 숫자나 담을 수 있다는것....
	 }
	public void show() {
		 int intMul = 1; // 곱하기이니까 1로 바꿔야댐.
	     for(int i : intList) {
		     intMul *= i;    
			}
	     System.out.println(intMul);
	}
}
