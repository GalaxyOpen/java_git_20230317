package day10;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportCar scar = new SportCar();
		scar.run1();
		System.out.println(scar.speed);

	}

}

class Car {
	String color;
	String tire;
	int speed;

	public void run() {
		this.speed++;
	}
}

class SportCar extends Car {
	String engine;

	public void run() {
		System.out.println("SportCar run 메소드");
		this.speed += 2; // 오버라이딩 : 부모의 메소드를 다시 정의하고싶을때
	}

	public void run1() {
		System.out.println("SportCar run 메소드");
		this.speed += 4;
	}
}