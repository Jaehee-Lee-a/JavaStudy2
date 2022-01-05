package com.java.s4;

public class CatMain {

	public static void main(String[] args) {
		System.out.println("Git Test2");
		Cat cat = new Cat();
		cat.age = 1;
		cat.name = "냥냥이"; 
		cat.color = "치즈";
		
		CatInfo catInfo = new CatInfo();
		catInfo.print(cat);

	}

}
