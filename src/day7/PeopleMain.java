package day7;

public class PeopleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//객체만들기
		//1. 기본생성자 사용하여 people1객체만들기
		//	- 객체 생성 후 name, age 필드 주입
		//	- print메소드 호출
		
		People people1 = new People();
		people1.setName("홍길동");
		people1.setAge(90);
		
		

		//2. 매개변수(String)생성자 사용하여 people2 객체만들기
		//	- 객체 생성 후  age 필드 주입
		//	- print메소드 호출
		
		People people2 = new People("이순신");
		people2.setAge(80);
		
		
		//3. 매개변수(String, int)생성자 사용하여 people3 객체 만들기
		//	- print메소드 호출
		People people3 = new People("심청이", 70);
		
	
//		people1.ageUp();
//		people2.ageUp();
//		people3.ageUp();
//		
//		people3.ageUp3();
		
		
		people1.ageUp4("-", 50);		
		people3.ageUp4("*", 3);
		
		people1.print();
		people2.print();
		people3.print();
		

		
		
	}

}
