package com.java.s1;

public class StudentMain {

	public static void main(String[] args) {
		// Student class 를 보고 Student 객체 (instance)를 생성
		Student stu = new Student();
		stu.name = "iu";
		stu.number = 4;
		stu.kor = 50;
		stu.math = 82;
		stu.eng = 23;
		stu.total = stu.kor+stu.math+stu.eng;
		stu.avg = stu.total/3.0;
		
		System.out.println("총점 : "+stu.total);
		System.out.println("평균 : "+stu.avg);
		
		Student stu2 = new Student();
		System.out.println("Stu2 Number : "+stu2.number);
		System.out.println("Stu2 Name : "+stu2.name);
		System.out.println("Stu2 avg : "+stu2.avg);
		
		int [] ar = new int [3];
		System.out.println(ar[0]);
		
		stu2 = stu;
		System.out.println("Stu : "+stu.name);
		System.out.println("Stu2 : "+stu2.name);
		
		stu.name = "suji";
		System.out.println("Stu2 : "+stu2.name);
		
//		stu = new Student();
//		System.out.println("Stu Name : "+stu.name);
		
		
	}

}
