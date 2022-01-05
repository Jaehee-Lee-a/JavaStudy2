package com.java.s1;

public class StudentMain2 {

	public static void main(String[] args) {
		// 배열 : 같은 데이터타입의 묶음
		// class 는 데이터 타입
		// 학생 3명을 모을 배열 선언
		// 배열선언 : 모을려고하는데이터타입[] 변수명 = new 모을려고하는데이터타입[size];

		Student[] students = new Student[3];
		System.out.println(students[0]);
	//	System.out.println(students[0].name);
		
		//0번 인덱스 방에 학생 한 명을 입력
		Student stu = new Student();
		students[0] = stu;
		System.out.println(students[0].name);
		students[1] = new Student();
		
		students[0].name = "iu";
		students[1].name = "suji";
		
		System.out.println(students[0].name);
		System.out.println(students[1].name);
		
		stu.name = "choa";

		System.out.println(students[0].name);
		System.out.println(students[1].name);
		
	}
}
