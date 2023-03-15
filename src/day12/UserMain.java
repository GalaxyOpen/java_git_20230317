package day12;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Util util = new Util();
//		UserService service = new UserService();
		UserService service = UserService.getInstance();
		boolean loginOk = false;

		while (true) {
			System.out.println("================ " + UserDTO.getDomain() + " ================");
			if (loginOk) {
				System.out.println("1.정보읽기 2.로그아웃 3.회원수정 4.회원탈퇴 0.종료");
			} else {
				System.out.println("1.회원가입 2.로그인 3.회원리스트 4.도메인변경 0.종료");
			}
			System.out.print("선택> ");
			int menu = util.numberCheck();

			if (menu == 1) {
				if (loginOk) {
					service.findById();
				} else {
					service.save();
				}
			} else if (menu == 2) {
				if (loginOk) {
					service.logout();
					loginOk = false;
					System.out.println("\n로그아웃 되었습니다.");
				} else {
					loginOk = service.loginCheck();
				}
			} else if (menu == 3) {
				if (loginOk) {
					service.update();
				} else {
					service.findAll();
				}
			} else if (menu == 4) {
				if (loginOk) {
					loginOk = service.delete();
				} else {
					service.domainChange();
				}
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("\n다시입력");
			}
			System.out.println();
		}
		System.out.println("\n프로그램 종료");
	}

}