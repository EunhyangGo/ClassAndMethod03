package com.biz.classes;

public class MyClass08 {
	
	public MyClass08(){
		
	}
	public void show(char a, char b) {
		
		for(int i = a; i <= b ; i++ ) {
			System.out.print((char)i);
		}
		
		String s = "";
		for(int i = a; i <b; i++) {
			char c =(char)i;
			s+=String.valueOf(c);
		}
		System.out.println(s);
	}

}
