package day7;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		cal.num1 = 19;
		cal.num2 = 8;
		
		//메소드를 이용하여 더하기 빼기 곱하기 나누기 값 출력
		
		cal.sum();
		cal.sub(18, 7);
		int s = cal.mul();
		System.out.println(s); //System.out.println(cal.mul);
		System.out.println(cal.div(10, 3));
	}

}
