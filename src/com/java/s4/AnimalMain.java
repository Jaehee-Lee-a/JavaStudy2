package com.java.s4;

import java.util.Scanner;

public class AnimalMain {

	public static void main(String[] args) {
		// 고양이, 강아지, 원숭이를 1마리씩 생성

		// 1. 고양이
		// 2. 강아지
		// 3. 원숭이
		// 4. 종료

		Scanner sc = new Scanner(System.in);
		Animal animal = new Animal();
		boolean flag = true;
		while (flag) {
			System.out.println("번호를 입력하세요.");
			System.out.println("1. 고양이");
			System.out.println("2. 강아지");
			System.out.println("3. 원숭이");
			System.out.println("4. 종료");

			int num = sc.nextInt();

			if (num == 1)
				animal.cat();
			else if (num == 2)
				animal.dog();
			else if (num == 3)
				animal.monkey(2,2);
			else {
				flag = false;
				System.out.println("프로그램 종료");
			}
		}
		sc.close();	
		
	}
}
