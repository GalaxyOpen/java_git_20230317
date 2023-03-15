package day2;

import java.util.Scanner;

public class 반복문_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int a = 1;
		while(a <= 10000) {
			sum = sum+a;
			a++;
		}System.out.println(sum);

		//Scanner sc = new Scanner(System.in);
//		System.out.println("숫자입력> ");
//		int num1 = sc.nextInt();
//		while (num1 != 0) {
//			System.out.println("숫자입력> ");
//			num1 = sc.nextInt();
//		}
//		System.out.println("끝");
//		
//		Scanner sc = new Scanner(System.in);
//		int num = -1;
//		while(num != 0) {
//			System.out.println("숫자입력> ");
//			num = sc.nextInt();
//		}
//		System.out.println("끝");
//		
//		<블리언 사용>
//		Scanner sc = new Scanner(System.in);
//		boolean check = true;
//		while(check) {
//			System.out.println("숫자입력> ");
//			int num = sc.nextInt();
//			if(num == 0) {
//				check = false;
//			}else if(num % 3 == 0 && num % 5 == 0) {
//				System.out.println("3과 5의 배수입니다");
//			}else if(num % 3 == 0) {
//				System.out.println("3의 배수");
//			}else if(num % 5 == 0) {
//				System.out.println("5의 배수");
//			}else {
//				System.out.println("둘다아님");
//			}
//		}System.out.println("끝");
//		
//		
//		Scanner sc = new Scanner(System.in);
//		int num = -1;
//		while(num != 0) {
//			System.out.println("숫자입력> ");
//			num = sc.nextInt();
//			if(num != 0) {
//				if(num % 3 == 0 && num % 5 == 0) {
//					System.out.println("3과 5의 배수입니다");
//				}else if(num % 3 == 0) {
//					System.out.println("3의 배수");
//				}else if(num % 5 == 0) {
//					System.out.println("5의 배수");
//				}else {
//					System.out.println("둘다아님");
//				}
//			}
//		}System.out.println("끝");
//		
//		
//		
	}

}
