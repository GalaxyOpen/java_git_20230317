package day1;

import java.util.Scanner;

public class 조건문_if예제 {

	public static void main(String[] args) {
		// 문제) 변수 a가 음수이면 "음수입니다", 양수이면 "양수입니다", 0이면 "0입니다"를 출력 
		
		/*int a = -3;
		
		if(a < 0) {
			System.out.println("음수입니다");
		}else if(a > 0) {
			System.out.println("양수입니다");
		}else {
			System.out.println("0입니다");
		}*/
		// 문제) 변수 SCORE가 90이상이라면 "A",
		// 80이상이라면 "B",
		// 70이상이라면 "C",
		// 60이상이라면 "D",
		// 60이하라면 "F" 를 출력
		
		/*int score = 70;
		
		if(score >=90) {
			System.out.println("A");
			}else if(score >=80) {
				System.out.println("B");
				}else if(score >=70) {
					System.out.println("C");
				}else if(score >=60) {
					System.out.println("D");
				}else {
					System.out.println("F");
				}*/
		//문제) 변수 num이 짝수이면 "짝수" 홀수이면 "홀수" 출력
		
		/*int num = 111;
		
		if(num == 0) {
			System.out.println("0");
		}else if(num % 2 == 1) {
			System.out.println("홀수");
		}else if(num % 2 == 0) {
			System.out.println("짝수");
		}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("====계산기====");
		System.out.print("첫번째 숫자입력>");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자입력>");
		int num2 = sc.nextInt();
		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
		System.out.print("메뉴선택>");
		int menu = sc.nextInt();
		if(menu == 1) {
			System.out.println(num1 + num2);
		}else if(menu == 2) {
			System.out.println(num1 - num2);
		}else if(menu == 3) {
			System.out.println(num1 * num2);
		}else if(menu == 4) {
			System.out.println(num1 / num2);
		}else if(menu == 5) {
			System.out.println(num1 % num2);
		}else {
			System.out.println("다시 입력해주세요.");
		}
		
		
		
				
		
				
		
		
				
			
		
		
	}
}
	