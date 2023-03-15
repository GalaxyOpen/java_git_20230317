package day8;

import java.util.Scanner;

public class Util {

	// 숫자체크 메소드 > 해당메뉴에는 "숫자만 입력하세요" 라고 안내문구 만들기
	// 입력된 값이 문자인지 숫자인지 체크 > next(); > 띄어쓰기 구분으로 해당 구문만 조회, nextLine(); > 띄어쓰기까지
	// 포함하여 문자열 자체를 조회

	public int numberCheck() {
		int result;
		Scanner sc = new Scanner(System.in);

		while (true) {
			if (sc.hasNextInt()) {                   // sc.hasNextInt() 숫자인지 문자인지 해당 체크 / 숫자일떄는 true, 이외는 false    
				result = sc.nextInt();
				break;
			} else {
				System.out.println("숫자만 입력 > ");
				sc.nextLine();
			}
		}
		return result;
	}
	////////////////////////////////////////////////////////////////////
	public int numberCheck1(String str) {
		int result;
	
		Scanner sc = new Scanner(System.in);

		while (true) {
			if (sc.hasNextInt()) {                    
				result = sc.nextInt();
				break;
			} else {
				System.out.println(str+ " 은/는 숫자만 입력 > ");
				sc.nextLine();
			}
		}
		return result;	
	
	}
	////////////////////////////////////////////////////////////////////////////////////////////
	// 아이디는 6자 이내 체크 함수     / sysout (str.length ) > 해당 입력값에 대해 해당 글자수 길이 개수를 출력
	// lengthCheck
	

}
