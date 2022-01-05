package com.java.s4;

public class TestMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		
		Test t = new Test();
		
		//메서드 호출
		t.info();
		System.out.println();
		t.info2();
		System.out.println("Main Finish");

	}

}
