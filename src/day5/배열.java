package day5;

public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name1 = "홍길동";
		String name2 = "이순신";
		String name3 = "심청이";
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		String[] name = new String[3]; //문자열이 들어갈 수 있는 배열 3칸 만들기 0부터시작 0~2
		//int[] i = {34, 98, 94, 3, 5, 124, 1, 34, 25, 74}; ㅡ> 값을 애초에 지정(생성,초기화 동시에)
		int[] i = new int[10]; //정수가 들어갈 수 있는 배열 10칸 만들기 0부터 시작함 0~9 ㅡ> 배열생성만 먼저 밑엔 초기화함
		i[0] = 34;
		i[1] = 98;
		i[2] = 94;
		i[3] = 3;
		i[4] = 5;
		i[5] = 124;
		i[6] = 1;
		i[7] = 34;
		i[8] = 25;
		i[9] = 74;
		
		for(int j=0; j<i.length;/*i길이 = 10*/ j++) {
			System.out.println(i[j]);
		}
		
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		
		
		
	}

}
