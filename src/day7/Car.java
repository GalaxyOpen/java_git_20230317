package day7;

public class Car {
	String name;
	String tire;
	String color;
	int speed;
	
	public void run() {
		speed = speed+1; //speed += 1;
	}
//	public void speedRun() {
//		speed = speed+2;
//	}
	// 메서드 print 만들기
	public void print() {
		System.out.println(name+" = "+tire+" = "+color+" = "+speed);
	}
	
	public void speedRun(int s) {
		System.out.println(name+" speedRun메소드 호출됌 ");
		speed += s;
	}
	
	public String getColor() {
		return color;
	}
	
	
	
	
}
