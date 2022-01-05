package com.java.s1;

import java.util.Scanner;

public class StudyMain3 {

	public static void main(String[] args) {
		// 학생수를 입력 받아서
		// 학생들을 3명 모을 배열 선언
		// 학생들을 생성해서 배열에 대입
		// 반복문 사용
		Scanner sc = new Scanner(System.in);
		Student[] students = null; // 지역변수니까 초기화 해줘야함.
		Student[] addStudents = null; // 학생추가 배열
		Student[] printStudents = null; // 출력배열
		// Student[] deleteStudents = null;
		Student stu;
		Student addStu;
		// Student deleteStu;
		int num = 0;
		boolean check = true;
		StudentView studentview = new StudentView();
		while (check) {
			System.out.println("원하시는 메뉴를 선택하세요.");
			System.out.println("1. 학생정보 입력");
			System.out.println("2. 학생정보 출력");
			System.out.println("3. 학생정보 검색");
			System.out.println("4. 학생정보 추가"); // 기존 배열 말고 새로운 배열을 만들어 기존 배열 복사해 온 후 새로운 데이터 추가
			System.out.println("5. 학생정보 삭제"); // 삭제도 마찬가지. 새로운 배열을 만든 후 데이터 삭제 후 복사?
			System.out.println("6. 프로그램 종료");
			int select = sc.nextInt(); // 메뉴 선택

			if (select == 1) { // 1번 선택
				System.out.println("학생 수를 입력하세요.");
				num = sc.nextInt();
				students = new Student[num]; // 입력받은 수 크기의 배열 생성

				// ----학생들의 정보 입력----//
				for (int i = 0; i < students.length; i++) {
					stu = new Student(); // Student 객체 생성
					// students[i] = new Student();
					System.out.println((i + 1) + " 번째 학생의 이름을 입력하세요.");
					stu.name = sc.next();
					System.out.println((i + 1) + " 번째 학생의 번호를 입력하세요.");
					stu.number = sc.nextInt();
					System.out.println((i + 1) + " 번째 학생의 국어점수를 입력하세요.");
					stu.kor = sc.nextInt();
					System.out.println((i + 1) + " 번째 학생의 영어점수를 입력하세요.");
					stu.eng = sc.nextInt();
					System.out.println((i + 1) + " 번째 학생의 수학점수를 입력하세요.");
					stu.math = sc.nextInt();
					stu.total = stu.kor + stu.math + stu.eng;
					stu.avg = stu.total / 3.0;
					students[i] = stu; // stu의 주소값을 students[i]번째 배열에 넣어주기.
				} // 정보 입력 종료
			}
			// ----학생들의 정보 입력 끝 ----//

			// ----학생들의 정보 출력 ----//
			else if (select == 2) {

				if (students == null) { // 예외처리. 1번을 선행하지않고 2번을 누를경우 에러 뜨는거 처리
					System.out.println("학생 정보가 없습니다.");
					continue;
				}

				if (addStudents == null) // 추가된 학생이 없다면 그대로 students 배열로
					printStudents = students;
				else // 추가된 학생이 있다면 추가된 배열로
					printStudents = addStudents;
				
			
				System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균\t");
				System.out.println("-------------------------------------------------------");
				for (int i = 0; i < printStudents.length; i++) {
					studentview.studentAll(printStudents[i]);
//					System.out.print(printStudents[i].name + "\t");
//					System.out.print(printStudents[i].number + "\t");
//					System.out.print(printStudents[i].kor + "\t");
//					System.out.print(printStudents[i].eng + "\t");
//					System.out.print(printStudents[i].math + "\t");
//					System.out.print(printStudents[i].total + "\t");
//					System.out.print(printStudents[i].avg + "\t");
//					System.out.println();
				}

			} // 2번 종료

			else if (select == 3) {
				System.out.println("학생 번호 검색");
				boolean chk = true;
				while (chk) {
					System.out.println("1. 검색시도");
					System.out.println("2. 취   소");
					select = sc.nextInt();

					if (select != 1) { // 검색시도가 아닌 다른 수를 입력하면 3번 종료
						break;
					}

					if (addStudents == null) // 4번에서 추가된 학생이 없다면 그대로 students 배열로
						printStudents = students;
					else // 추가된 학생이 있다면 추가된 배열로
						printStudents = addStudents;

					while (chk) {
						System.out.println("검색을 원하는 학생의 번호를 입력하세요.");
						int search = sc.nextInt();

						for (int i = 0; i < printStudents.length; i++) {
							if (printStudents[i].number == search) { // 내가 검색한 번호(search)가 배열에 있다면 출력
								studentview.studentOne(printStudents[i]); //출력 class(StudentView)
								chk = false; // 찾았으니 chk를 true로 바꾸기
								break;
							}
						}
						if (chk) // 검색한 번호가 배열에 없을 때
							System.out.println("일치하는 학생 정보가 없습니다.");
					}
				}
			} // 3번 끝
			else if (select == 4) { // 4. 학생정보 추가
				if (students == null) { // 예외처리. 1번을 선행하지않고 4번을 누를경우 에러 뜨는거 처리
					System.out.println("학생 정보가 없습니다.");
					continue;
				}
				int i = 0;
				System.out.println("추가를 원하는 학생 수를 입력하세요.");
				num = num + sc.nextInt();
				addStudents = new Student[num];
				for (; i < students.length; i++) {
					addStudents[i] = students[i];
				}
				for (; i < addStudents.length; i++) {
					addStu = new Student();
					System.out.println("추가할 학생의 이름을 입력하세요.");
					addStu.name = sc.next();
					System.out.println("추가할 학생의 번호를 입력하세요.");
					addStu.number = sc.nextInt();
					System.out.println("추가할 학생의 국어점수를 입력하세요.");
					addStu.kor = sc.nextInt();
					System.out.println("추가할 학생의 영어점수를 입력하세요.");
					addStu.eng = sc.nextInt();
					System.out.println("추가할 번째 학생의 수학점수를 입력하세요.");
					addStu.math = sc.nextInt();
					addStu.total = addStu.kor + addStu.math + addStu.eng;
					addStu.avg = addStu.total / 3.0;
					addStudents[i] = addStu;
				}
			} else if (select == 5) { // 5. 학생정보 삭제
				if (students == null) { // 예외처리. 1번을 선행하지않고 4번을 누를경우 에러 뜨는거 처리
					System.out.println("학생 정보가 없습니다.");
					continue;
				}

//				System.out.println("삭제를 원하는 학생의 번호를 입력하세요.");
//				int delete = sc.nextInt();
//				for(int i = 0; i <students.length;i++) {
//					if(delete == students[i].number) {
//						students[i] = null;
//						System.out.println("삭제되었습니다.");
//					}
//				}
//				deleteStudents = new Student[students.length-1];
//				for (int i=0,j = 0; i < deleteStudents.length; i++,j++) {
//					if(students[i] == null) {
//						i++;
//					}
//						
//					deleteStudents[j] = students[i];
//				}
//				
//				System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균\t");
//				System.out.println("-------------------------------------------------------");
//				for (int i = 0; i < deleteStudents.length; i++) {
//					System.out.print(deleteStudents[i].name + "\t");
//					System.out.print(deleteStudents[i].number + "\t");
//					System.out.print(deleteStudents[i].kor + "\t");
//					System.out.print(deleteStudents[i].eng + "\t");
//					System.out.print(deleteStudents[i].math + "\t");
//					System.out.print(deleteStudents[i].total + "\t");
//					System.out.print(deleteStudents[i].avg + "\t");
//					System.out.println();
//				}
//				

			} else { // 다른 번호 선택시 프로그램 종료
				System.out.println("프로그램 종료");
				check = false;
			}
		} // while 무한반복문 종료
	} // 메인 종료
}
