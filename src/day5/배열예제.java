package day5;

import java.util.Scanner;

public class 배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//문제) 문자열 배열에 문자열 5개를 할당하고, 전체 출력
//		String[] str = {"안녕", "하세요", "조하영입니다", "반갑", "습니다"};
//		System.out.println(str.length); //5라고 뜸
//		for(int j=0; j<str.length; j++) {
//			System.out.println(str[j]);
//		}
		
		//문제) int배열 10칸에 값을 할당하고, 짝수번째의 합 출력
//		int[] num = {10,50,40,35,47,48,60};
//		int sum = 0;
//		
//		for(int i=0; i<num.length; i++) {
//			if(i % 2 == 0) {
//				sum = sum + num[i];
//			}
//			
//		}System.out.println(sum);
		
		//문제)값이 짝수인 것을 구하라
//		int[] num = {10,50,40,35,47,48,60};
//		int sum = 0;
//		
//		for(int i=0; i<num.length; i++) {
//			if(num[i] % 2 == 0) {
//				sum = sum + num[i]; //sum += num[1];
//			}
//		}System.out.println(sum);
		
		//배열 int[] 방만 만들고 출력하면 기본값 0이 들어감 String은 null이 기본값
		//100칸 배열에 1~100까지출력
//		int[] num = new int[100];
//		for(int i=0; i<num.length; i++) {
//			num[i] = i+1;
//		}
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}
		
		//10칸까지 배열에 숫자10개 입력받고 출력
		//
//		Scanner sc = new Scanner(System.in);
//		int[] num = new int[10];
//		for(int i=0; i<num.length; i++) {
//			System.out.print((i+1)+ "번째 숫자입력> ");
//			num[i] = sc.nextInt();
//		}
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}
//				
		//문제) 10칸짜리 정부배열 선언 후, 값을 받고, 값이 3의 배수의 합 출력
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		
//		int[] num = new int[10];
//		for(int i=0; i<num.length; i++) {
//			System.out.print((i+1)+ "번째 숫자입력> ");
//			num[i] = sc.nextInt();
//			
//		}
//		for(int i=0; i<num.length; i++) {
//			if(num[i] % 3 == 0) {
//				sum += num[i];
//			}
//		}System.out.println(sum);
		
		//숫자 10칸 배열 3의배수 개수, 5의배수 개수, 3과5의 배수 개수 출력
//		Scanner sc = new Scanner(System.in);
//		int[] num = new int[10];
//		int cnt1 = 0;
//		int cnt2 = 0;
//		int cnt3 = 0;
//		
//		for(int i=0; i<num.length; i++) {
//			System.out.print(i+1+"번째 숫자입력> ");
//			num[i] = sc.nextInt();
//		}
//		for(int i=0; i<num.length; i++) {
//			if(num[i] % 3 == 0) {
//				cnt1++;
//				
//			}if(num[i] % 5 == 0) {
//				cnt2++;
//			
//			}if(num[i] % 3 == 0 && num[i] % 5 == 0) {
//				cnt3++;
//				
//			}
//		}
//		System.out.println("3의 배수는 "+ cnt1+"개 입니다");
//		System.out.println("5의 배수는 "+ cnt2+"개 입니다");
//		System.out.println("3과 5의 배수는 "+ cnt3+"개 입니다");
		
		//문제) 10칸의 정수배열을 만들고, 반복하면서 입력을 받는데 짝수만 배열에 저장 후 출력
//		Scanner sc = new Scanner(System.in);
//		int[] num = new int[10];

		//for문 예시 i--하고 증감-조건-실행-증감-조건-실행
//		for(int i=0; i<num.length; i++) {
//			System.out.print("숫자입력> ");
//			int number = sc.nextInt();
//			if(number % 2 == 0) {
//				num[i] = number;
//			}else {
//				i--;
//			}
//		}
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}
		
		//while문으로 예시(브레이크사용)
//		Scanner sc = new Scanner(System.in);
//		int[] num = new int[10];
//		int j = 0;
//		
//		while(true) {
//			System.out.println("숫자입력> ");
//			int number = sc.nextInt();
//			
//			if(number % 2 == 0) {
//				num[j] = number;
//				j++;
//			}
//			if(j == 10) {
//				break;
//			}
//		}
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}
		
		//while 브레이크 없이	
//		Scanner sc = new Scanner(System.in);
//		int[] num = new int[10];
//		int j = 0;
//		
//		while(j >= 10) {
//			System.out.print("숫자입력> ");
//			int number = sc.nextInt();
//			
//			if(number % 2 == 0) {
//				num[j] = number;
//				j++;
//			}
//		}
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//			}
//		
		
		
//		//숙제 배열 num의 값을 앞으로 한칸씩 당기시오.
//		// num {2,3,4,5,6,7,8,9,10,1}로 만들기
		
//		int[] num = {21,52,33,14,25,56,47,18,29,10};
//		int num0 = num[0];
//
//		for(int i=0; i<num.length; i++) {
//			if(i == num.length-1) {
//				num[i] = num0;
//				break;
//			}
//			num[i] = num[i+1];
//		}
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}
		
		//배열 num의 값을 뒤로 한칸씩 미시오.
		
//		int[] num = {3, 45, 48, 42, 40, 21, 35, 20};
//		int num0 = num[num.length-1];
//		
//		for(int i=num.length-1; i<num.length; i--) {
//			if(i == 0) {
//				num[0] = num0;
//				break;
//			}
//			num[i] = num[i-1];
//		}
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}
		int[] num = {3, 45, 48, 42, 40, 21, 35, 20};
		int num0 = num[num.length-1];
		
		for(int i=0; i<num[num.length]; i++) {
			if(i==0) {
				continue;
			}else if(i<num[num.length-2]) {
				num[i] = num[i+1];
				num[i] = num[i-1];
				break;
			}else if(i==num[num.length-1]) {
				num[i] = num[i-1];
				num[0] = num0;
				break;
			}
		}
		
			
			
		
		num[0] = num0;
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
		
		
		
		
		
	}

}
