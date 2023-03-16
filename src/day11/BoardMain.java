package day11;

import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 사용자로부터 입력받은값은 무조건 데이터베이스에 들어가야된다
		// 실직적인 데이터의 마지막 저장소는 데이터베이스이다
		BoardService service = new BoardService();

		while (true) {
			System.out.println("=====게시판=====");
			System.out.println("1.게시글등록 2.리스트 3.읽기 4.수정 5.삭제 6. Test데이터 입력 7. 검색 0.종료");
			System.out.println("메뉴선택> ");
			int menu = sc.nextInt();

			// 게시글 등록을 누르면 보드서비스에 있는 세이브 메소드를 실행시켜주고 메소드는 사용자로부터 입력을 받고 보드레퍼지를 실행하고 보드에 메소드를
			// 실행함..?
			// 서비스에 있는 메소드를 호출해줘야됨
			if (menu == 1) {

				service.save();

			} else if (menu == 2) {
				// 메인에서 리스트를 보고싶으면 메인에서 서비스호출 서비스에서는 레퍼지에있는 리스트를 가져온다

				service.findAll();

			} else if (menu == 3) {
				service.findById();
			} else if (menu == 4) {
				service.update(); // 서비스에있는 업데이트 메소드를 호출해라
			} else if (menu == 5) {
				service.delete();
			} else if (menu == 6) {
			    service.testdata();
			} else if (menu == 7) {  
			    //service.index();
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시 입력");
			}

		}

	}
}
