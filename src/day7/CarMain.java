package day7;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//필드와 변수차이
		//변수는 자신이 선언된 생성자 또는 메소드 안에서만 사용가능
		//필드
		//메소드: 동작을 표현(실행상자) input(메소드호출) → 실행할코드(메소드) → output(메소드돌리고나오는값)
		//누군가가 실행시켜줘야 실행함(호출한다) public void run(){~~}
		//접근제한자 리턴타입 메소드이름(매개변수){
		//      실행할코드
		//      return 리턴 값; → 메소드가 리턴하는 결과의 타입을 표시(int,String..)없으면 void표시
		//}
		//접근제한자:접근을 제한한다. /메소드이름:메소드이름작성. /매개변수:넘겨받을 데이터를 저장하기위한 변수선언
		//public String speedUp(int speed){
		//      String str="스피드는"+speed;
		//  	return str;
		// String s = speedUp(14); 스피드업(14)의 리턴값을 s에 할당
		//sysout(s) / 실행 스피드는 14입니다
		//String s = speedUp();
	
		
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.name = "그랜져";
		c1.tire = "한국";
		c1.color = "빨강";
		c1.speed = 10;
			
		c2.name = "제네시스";
		c2.tire = "넥센타이어";
		c2.color = "검정";
		c2.speed = 20;

		
//		c1.run(); //Car클래스에서 run 스피드+1 했기에 스피드 1오름
//		c2.speedRun(); //Car클래스에서 runspeed 스피드+2 했기에 스피드 2오름
//		System.out.println(c1.name+" / "+c1.color+" / "+c1.speed);
//		System.out.println(c2.name+" / "+c2.color+" / "+c2.speed);
		
		c1.speedRun(100);
		c2.speedRun(200);
		
		c1.print();
		c2.print();
		
		System.out.println(c1.getColor());
		System.out.println(c2.getColor());
	}

}
