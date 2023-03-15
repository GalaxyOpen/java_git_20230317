package day7;

public class Calculator {

	int num1; //필드
	int num2; //필드
	
	//리턴x,메소드명sum,매개변수x,매개변수 두수+
	public void sum() {
		System.out.println(num1 + num2);
	} //메소드
	
	//리턴x,메소드명sub,매개변수 int 2개 매개변수 두수-
	public void sub(int n1, int n2) {
		if(n1 > n2) {
			System.out.println(n1 - n2);
		}else {
			System.out.println(n2 - n1);
		}
		
	}
	//리턴 int,메소드명mul,매개변수x 매개변수 두수 *
	public int mul() {
		return num1 * num2;
	}
	
	//리턴 ?,메소드명div,매개변수 2개 매개변수 두수 /
	public double div(int n1, int n2) {
		return n1 / (double)n2;
	}
	
	
}
