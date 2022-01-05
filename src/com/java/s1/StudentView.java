package com.java.s1;

public class StudentView {
	public void studentAll(Student student) {
		//모든 학생의 정보를 출력
		
			System.out.print(student.name + "\t");
			System.out.print(student.number + "\t");
			System.out.print(student.kor + "\t");
			System.out.print(student.eng + "\t");
			System.out.print(student.math + "\t");
			System.out.print(student.total + "\t");
			System.out.print(student.avg + "\t");
			System.out.println();
		
	}
	public void studentOne(Student student) {
		//학생 한명의 정보를 출력
		//이름, 번호, 국어, 영어, 수학, 총점, 평균
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균\t");
		System.out.println("-------------------------------------------------------");
		System.out.print(student.name + "\t"); //이름
		System.out.print(student.number + "\t"); //번호
		System.out.print(student.kor + "\t"); //국어
		System.out.print(student.eng + "\t"); //영어
		System.out.print(student.math + "\t"); //수학
		System.out.print(student.total + "\t"); //총점
		System.out.println(student.avg + "\t"); //평균
	}
	
}
