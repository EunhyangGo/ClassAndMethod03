package com.biz.classes;

public class ClassExec03 {


	public static void main(String[] args) {
		MyClass03 m = new MyClass03();
		
		m.push(10);
		m.push(20);
		
		// m. show()method에서 어떤 값을 return하라.
		System.out.println(m.show());
	}
}
