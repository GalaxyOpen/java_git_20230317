package day5;

import java.util.Scanner;

public class Ex01_sign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//1.로그인 ㅡ> 비밀번호수정, 로그아웃 2.로그인실패
		//문제점. 로그아웃시, 다시 로그인하는 창이 안뜸
		// 이유. 로그아웃하고 바로 종료되기 때문
		
		String name = "";
		String id = "";
		String pw = "";
		boolean run = true;
		
		while(run) {
			System.out.println("=====회원가입=====");
			System.out.println("1.회원가입 2.로그인 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.print("이름입력> ");
				name = sc.next();
				System.out.print("아이디 입력> ");
				id = sc.next();
				System.out.print("비밀번호 입력> ");
				pw = sc.next();
				System.out.println(name+ "님 회원가입을 축하드립니다\n");
				
			}else if(menu ==2) {
				System.out.print("아이디를 입력해주세요> ");
				String loginId = sc.next();
				System.out.print("비밀번호를 입력해주세요> ");
				String loginPw = sc.next();
				if(loginId.equals(id) && loginPw.equals(pw)) {
					System.out.println("\n로그인 성공\n");
					System.out.println("1.비밀번호 수정 2.로그아웃("+ name +"님)");
					System.out.println("메뉴선택> ");
					menu = sc.nextInt();
					if(menu == 1) {
						System.out.print("수정할 비밀번호를 입력해주세요> ");
						loginPw = sc.next();
						pw = loginPw;
						System.out.println(name+"님 비밀번호가 수정되었습니다\n");
					}else if(menu == 2) {
						System.out.println("로그아웃에 성공하셨습니다");
						run = false;
					}
				}else {
					System.out.println("로그인 실패\n");
				}
			}else {
				System.out.println("시스템을 종료합니다");
				break;
			}
			
			
			
			
			
		}
		
		
		
		
		
	}

}
