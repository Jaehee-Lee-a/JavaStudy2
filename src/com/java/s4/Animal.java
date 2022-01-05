package com.java.s4;

public class Animal {
	//cat
	//고양이 울음 소리 출력
	public void cat() {
		for(int i = 0; i<3; i++)
			System.out.println("야옹");
	}
	
	//dog
	//강아지 울음 소리 출력
	public void dog() {
		for(int i = 0; i<3; i++)
			System.out.println("멍멍");
	}
	//monkey
	//원숭이 울음 소리 출력
	public void monkey(int num, int kind) { //1. 성체 2. 새끼
		for(int i = 0; i<num; i++) {
		if(kind == 1) {
			System.out.println("우끼");
		}
		else {
			System.out.println("우끼끼");
		}
		}
	}
}
