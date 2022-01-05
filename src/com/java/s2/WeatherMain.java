package com.java.s2;

import java.util.Scanner;

public class WeatherMain {

	public static void main(String[] args) {
		// 1. 날씨 정보 입력(scanner 사용)
		// 2. 전체 날씨 출력
		// 3. 도시 검색 출력 - 출력할 지역번호 입력
		// 4. 프로그램 종료
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		Weather[] weatherClass = null; // 도시 정보 저장
		Weather weather;

		while (check) {
			System.out.println("원하는 메뉴를 선택하세요.");
			System.out.println("1. 날씨 정보 입력");
			System.out.println("2. 전체 날씨 출력");
			System.out.println("3. 도시 검색 출력");
			System.out.println("4. 프로그램 종료");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("날씨 정보 입력을 선택하였습니다.");
				System.out.println("저장을 원하는 도시 수를 입력하세요.");
				int num = sc.nextInt();
				weatherClass = new Weather[num];

				for (int i = 0; i < weatherClass.length; i++) {
					weather = new Weather();
					System.out.println("지역번호를 입력하세요.");
					weather.number = sc.nextInt();
					System.out.println("도시명을 입력하세요.");
					weather.city = sc.next();
					System.out.println("기온을 입력하세요. ");
					weather.temperature = sc.nextDouble();
					System.out.println("습도를 입력하세요.");
					weather.humidity = sc.nextInt();
					System.out.println("날씨를 입력하세요.");
					weather.state = sc.next();
					System.out.println("미세먼지 농도를 입력하세요.");
					weather.dust = sc.next();
					weatherClass[i] = weather;
				} // 날씨 정보 입력 종료
			} else if (select == 2) {
				if (weatherClass == null) {
					System.out.println("저장된 날씨 정보가 없습니다.");
					continue;
				}
				System.out.println("전체 날씨 출력을 선택하였습니다.");
				System.out.println("지역번호\t도시명\t기온\t습도\t날씨\t미세먼지 농도");
				System.out.println("---------------------------------------------------");
				for (int i = 0; i < weatherClass.length; i++) {
					System.out.print("0" + weatherClass[i].number + "\t");
					System.out.print(weatherClass[i].city + "\t");
					System.out.print(weatherClass[i].temperature + "\t");
					System.out.print(weatherClass[i].humidity + "%\t");
					System.out.print(weatherClass[i].state + "\t");
					System.out.println(weatherClass[i].dust + "\t");
				}
			} else if (select == 3) {
				System.out.println("도시 검색을 선택하였습니다.");
				boolean flag = true;
				while (flag) {
					System.out.println("1. 검색시도");
					System.out.println("2. 취   소");
					select = sc.nextInt();

					if (select != 1)
						break;
					while (flag) {
						System.out.println("검색을 원하는 지역번호를 입력하세요.");
						int search = sc.nextInt();

						for (int i = 0; i < weatherClass.length; i++) {
							if (search == weatherClass[i].number) {
								System.out.println("지역번호\t도시명\t기온\t습도\t날씨\t미세먼지 농도");
								System.out.println("---------------------------------------------------");
								System.out.print("0" + weatherClass[i].number + "\t");
								System.out.print(weatherClass[i].city + "\t");
								System.out.print(weatherClass[i].temperature + "\t");
								System.out.print(weatherClass[i].humidity + "%\t");
								System.out.print(weatherClass[i].state + "\t");
								System.out.println(weatherClass[i].dust + "\t");
								flag = false;
								break;
							}
						}
						if (flag)
							System.out.println("일치하는 지역 정보가 없습니다.");
					}
				}
			} else {
				System.out.println("프로그램을 종료합니다.");
				check = false;
			}
		}
	}
}
