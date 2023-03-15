package day6;

import java.util.Scanner;

public class Ex03_account3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String[] name = new String[100];
		String[] account = new String[100];
		int[] balance = new int[100];
		int cnt = 0;
		
		while(true) {
			System.out.println("=====인천일보은행=====");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌이체 5.계좌목록 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.print("예금주명> ");
				name[cnt] = sc.next();
				System.out.print("계좌번호> ");
				account[cnt] = sc.next();
				System.out.print("초기입금금액> ");
				balance[cnt] = sc.nextInt();
				System.out.println(name[cnt]+"님 계좌가 개설되었습니다!");
				cnt++;
			}else if(menu == 2) {
				System.out.print("입금할계좌> ");
				String dAccount = sc.next();
				System.out.print("입금금액> ");
				int deposit = sc.nextInt();
				
				for(int i=0; i<cnt; i++) {
					if(dAccount.equals(account[i])) {
						balance[i] += deposit;
						System.out.println("입금완료!");
						break;
					}else if(i == cnt-1) {
						System.out.println("잘못된 계좌입니다");
					}					
				}
				
			}else if(menu == 3) {
				System.out.print("출금할계좌> ");
				String wAccount = sc.next();
				System.out.print("출금금액> ");
				int withdraw = sc.nextInt();
				boolean accountCheck = false;
				
				for(int i=0; i<cnt; i++) {
					if(wAccount.equals(account[i])) {
						if(balance[i] >= withdraw) {
							balance[i] -= withdraw;
							System.out.println("출금완료");
						}else {
							System.out.println("잔액부족");
						}
						accountCheck = true;
						break;
					}
				}
				if(!accountCheck) {
					System.out.println("잘못된 계좌번호입니다");
				}
				
			}else if(menu == 4) {
				System.out.print("출금할계좌> ");
				String wAccount = sc.next();
				System.out.print("입금할계좌> ");
				String dAccount = sc.next();
				System.out.print("계좌이체금액> ");
				int money = sc.nextInt();
				int wIndex = -1;
				int dIndex = -1;
				for(int i=0; i<cnt; i++) {
					if(wAccount.equals(account[i])) {
						wIndex = i;
					}
					if(dAccount.equals(account[i])) {
						dIndex = i;
					}
				}
				if(wIndex == -1) {
					System.out.println("출금계좌 오류");
				}else if(dIndex == -1) {
					System.out.println("입금계좌 오류");
				}else {
					if(balance[wIndex] >= money) {
						balance[wIndex] -= money;
						balance[dIndex] += money;
						System.out.println("계좌이체 성공!");
					}else {
						System.out.println("잔액부족");
					}
				}
				
			}else if(menu == 5) {
				System.out.println("예금주\t계좌번호\t잔액");
				System.out.println("--------------------------");
				for(int i=0; i<cnt; i++) {
					System.out.printf("%s\t%s\t%,d\n",name[i],account[i],balance[i]);
				}
			}else if(menu == 0) {
				break;
			}else {
				System.out.println("다시입력");
			}
			System.out.println();
			
			
			
			
			
			
			
			
			
		}
		System.out.println("프로그램 종료");
	}

}

