package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass04 {

	List<Integer> intList;
 
	public MyClass04() {
		intList = new ArrayList();
		
} 
	public void push(String num) {
		intList.add(Integer.valueOf(num));
		
		
	}
	public int show() {
		int intMul = 1;
		for(int i : intList) {
			intMul *= i;
		}
		
		return intMul;
	}
}

// push를 문자로 보이게 한다음 숫자로 저장해서 show에 곱셈값 보이기.