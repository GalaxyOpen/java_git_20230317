package day2;

import java.util.Scanner;

public class 조건문_switch_case예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 4;
//		switch(a) {
//		case 1:
//			System.out.println("January");
//			break;
//		case 2:
//			System.out.println("February");
//			break;
//		case 3:
//			System.out.println("March");
//			break;
//		case 4:
//			System.out.println("April");
//			break;
//		case 5:
//			System.out.println("May");
//			break;
//		case 6:
//			System.out.println("June");
//			break;
//		case 7:
//			System.out.println("July");
//			break;
//		case 8:
//			System.out.println("August");
//			break;
//		case 9:
//			System.out.println("September");
//			break;
//		case 10:
//			System.out.println("October");
//			break;
//		case 11:
//			System.out.println("November");
//			break;
//		case 12:
//			System.out.println("December");
//			break;
//			default:
//				System.out.println("그런 달은 없습니다");
			
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력> ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 입력> ");
		int num2 = sc.nextInt();
		System.out.println("메뉴 중에 하나를 입력하세요");
		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
		System.out.print("메뉴선택> ");
		int manu = sc.nextInt();
		switch(manu) {
		case 1:
			System.out.println(num1 + " + " + num2 +" = "+ (num1 + num2));
			break;
		case 2:
			System.out.println(num1 + " - " + num2 +" = "+ (num1 - num2));
			break;
		case 3:
			System.out.println(num1 + " * " + num2 +" = "+ (num1 * num2));
			break;
		case 4:
			System.out.println(num1 + " / " + num2 +" = "+ (num1 / num2));
		case 5:
			System.out.println(num1 + " % " + num2 +" = "+ (num1 % num2));
			break;
			default:
				System.out.println("메뉴 중에 하나를 입력하시오");
		}
	}

}
