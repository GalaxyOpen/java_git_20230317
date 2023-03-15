package day13;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try { // 예외처리 try를 실행하던중에 예외가 발생하면 캐치로 들어간다 

			int[] array = new int[5];
			System.out.println(array[5]); // 0,1,2,3,4 는 조건을 만족하여 인덱스초과가 나오지않는다. 

		} catch (Exception e) {
			System.out.println("인덱스 초과");
		}
		System.out.println("프로그램 끝");

	}

}
