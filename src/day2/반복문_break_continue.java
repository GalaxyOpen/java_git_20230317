package day2;

public class 반복문_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//			if(i == 5) {
//				break;
//			}
//		}System.out.println("끝");

//		
		// <가로>
//		for(int j=2; j<10; j++) {
//			for(int i=2; i<10; i++) {
//				System.out.printf("%d * %d = %d\t",i,j,(j*i));
//			}
//			System.out.println();
//		}

//		for(int j=0; j<10; j++) {
//			for(int i=2; i<10; i++) {
//				if(j==0) {
//					System.out.print(i+"단\t\t");	
//				}else {
//				System.out.printf("%d * %d = %d\t",i,j,(j*i));
//				}
//			}System.out.println();
//		}
//		
		// <세로>i가 곱하는 값
//		for(int j=2; j<10; j++) {
//			System.out.println(j+"단");
//			for(int i=1; i<10; i++) {
//				System.out.printf("%d * %d = %d\n", j,i,(j*i));
//			}System.out.println("\t");
//		}
		
//		int j=2;
//		int i=1;
//		while(j<10) {
//			System.out.println(j+"단");
//			i=1;
//			while(i<10) {
//				System.out.printf("%d * %d = %d\n", j,i,(j*i));
//				i++;
//			}j++;
//			System.out.println("\t");
//		}
//		
//		
//
		for (int j = 2; j < 10; j++) {
			if (j < 4) {
				continue;
			} else if (j == 8) {
				break;
			}
			System.out.println(j + "단");
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d\n", j, i, (j * i));
			}
			System.out.println("\t");

		}

//		
//		for(int i=1; i<=10; i++) {
//			if(i == 5) {
//				continue;
//			}
//			System.out.println(i);
//			
//		}

	}
}
