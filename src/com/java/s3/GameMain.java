package com.java.s3;

public class GameMain {

	public static void main(String[] args) {
		// 캐릭터 1명 생성
		Character pc1 = new Character();
		pc1.name = "jaehee";
		pc1.potions = new Potion[5];
		pc1.potions[0] = new Potion();
		pc1.potions[0].name = "힐링포션";
		pc1.potions[0].amount = 5;

		Potion potion = new Potion();
		potion.name = "마나포션";
		potion.amount = 10;
		pc1.potions[1] = potion;
		Character pc2 = new Character();
		pc2.name = "yejin";

		Sword sword = new Sword(); // 노란색 : 지역변수

		sword.name = "단검";
		sword.damage = 10;
		sword.inchant = 0;

		pc1.sword = sword; // 하늘색 : 멤버변수
		pc2.sword = new Sword();

		Monster monster = new Monster();
		monster.name = "오크";
		monster.hp = 100;
		monster.sword = new Sword();

		monster.sword.name = "청룡도";
		monster.sword.damage = 20;
		monster.sword.inchant = 2;
		System.out.println(pc1.name);
		System.out.println(pc1.sword.name);
		System.out.println(monster.name);
		System.out.println(monster.sword.name);
		// --- pc1이 monster 사냥 함
		pc1.sword = monster.sword;
		System.out.println(pc1.name);
		System.out.println(pc1.sword.name);
		System.out.println(pc1.sword.damage);
		System.out.println(pc1.sword.inchant);
	}

}
