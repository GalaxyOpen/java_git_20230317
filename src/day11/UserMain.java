package day11;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		UserService service = new UserService();
		boolean loginOk = false;

		while (true) {
			System.out.println("======" + UserDTO.getDomain() + "======");
			if (loginOk) {
				System.out.println("1.마이페이지 2.로그아웃 3.회원정보수정 4.회원탈퇴 0.종료");
			} else {
				System.out.println("1.회원가입 2.로그인 3.회원리스트 4.도메인변경 0.종료");
			}
			System.out.println("선택> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				if (loginOk) {
					service.findById();

				} else {
					service.save();

				}
			} else if (menu == 2) {
				loginOk = service.loginCheck();
			} else if (menu == 3) {
				service.findAll();

			} else if (menu == 4) {
				System.out.println("변경 할 도메인> ");
				UserDTO.setDomain(sc.next());
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("조회할 수 없습니다");
			}

		}
		System.out.println("프로그램 종료");

	}

}
