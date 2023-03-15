package day8;

import java.util.Scanner;

public class 메소드모음 {
	// 숫자체크메소드
	public int numberCheck() {
		int result;
		Scanner sc = new Scanner(System.in);
		while(true) {
			if(sc.hasNextInt()) {
				result = sc.nextInt();
				break;
			}else {
				System.out.print("숫자만 입력> ");
				sc.nextLine();
			}
		}
		return result;
	}
	
	public int numberCheck1(String str) {
		int result;
		Scanner sc = new Scanner(System.in);
		while(true) {
			if(sc.hasNextInt()) {
				result = sc.nextInt();
				break;
			}else {
				System.out.print(str+"은/는 숫자만 입력> ");
				sc.nextLine();
			}
		}
		return result;
	}
	//아이디는 6자 이내 체크 함수
	//lengthCheck
	public String lengthCheck(String str, int maxLength) {
		Scanner sc = new Scanner(System.in);
		System.out.print(str+"입력> ");
		String result;
		while(true) {
			result = sc.next();
			if(result.length() <= maxLength) {
				break;
			}
			System.out.printf("%s의 최대 글자수는 %d입니다> ",str,maxLength);
		}
		return result;
	}
	
	
	
	
	
	
	
}
