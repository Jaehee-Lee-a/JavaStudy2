package com.java.s4;

public class CatInfo {
	public void print(Cat cat) { //매개변수 한개만 선언해서 모두 출력
		

		System.out.println("고양이 이름");
		System.out.println(cat.name);
		System.out.println("고양이 나이");
		System.out.println(cat.age);
		System.out.println("고양이 색깔");
		System.out.println(cat.color);
	}
}
