package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//스택 합 참조변수
//== 는 스택변수에 저장된 값(주소)을 비교, 참조값을 비교할때는 equals()사용
//기본타입은 값이 스택에 저장 int b = 45  45가 스택에 담김
//참조타입(String등 앞에 대문자 배열,등) String b = "안녕" 안녕은 '힙'에 담기고 저장된 위치(주소)가 스택에 담김 고로 참조타입은 ==로 비교하면 앙댐





public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<>();
		
		while(true) {
			System.out.println("=====학사관리시스템=====");
			System.out.println("1.학생등록 2.리스트 3.검색 4.수정 5.삭제 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				Student student = new Student();
				System.out.print("이름> ");
				student.setName(sc.next());
				System.out.print("국어점수> ");
				student.setKor(sc.nextInt());
				System.out.print("영어점수> ");
				student.setEng(sc.nextInt());
				System.out.print("수학점수> ");
				student.setMat(sc.nextInt());
				student.setTotal();
				student.setAvg();
				student.setGrade();
				list.add(student);
				System.out.println(student.getName()+"학생이 등록되었습니다");
			}else if(menu == 2) {
				System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
				System.out.println("---------------------------------------------------");
				for(Student s : list) {
					s.print();
				}
			}else if(menu == 3) {
				System.out.print("검색할 학번> ");
				String sno = sc.next();
				boolean find = false;
				for(Student s : list) {
					if(sno.equals(s.getSno())) {
						System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
						System.out.println("---------------------------------------------------");
						s.print();
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("조회할 수 없는 학번입니다ㅜㅜ");
				}
			}else if(menu == 4) {
				System.out.print("수정할 학번> ");
				String sno = sc.next();
				boolean find = false;
				for(Student s : list) {
					if(sno.equals(s.getSno())) {
						System.out.print("수정할 이름> ");
						s.setName(sc.next());
						System.out.print("수정할 국어> ");
						s.setKor(sc.nextInt());
						System.out.print("수정할 영어> ");
						s.setEng(sc.nextInt());
						System.out.print("수정할 수학> ");
						s.setMat(sc.nextInt());
						s.setTotal();
						s.setAvg();
						s.setGrade();
						System.out.println("수정성공!");
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("조회할 수 없는 학번입니다");
				}
			}else if(menu == 5) {
				System.out.print("삭제할 학번> ");
				String sno = sc.next();
				boolean find = false;
				for(Student s : list) {
					if(sno.equals(s.getSno())) {
						list.remove(s);
						System.out.println("삭제성공");
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("조회할 수 없는 학번입니다");
				}
			}else if(menu == 0) {
				break;
			}else {
				System.out.println("다시입력");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
		
	}

}
