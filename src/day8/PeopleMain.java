package day8;

public class PeopleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		People p1 = new People();                      //public 외부 클래스 어디에서도 접근가능 , private 같은 클래스에서만 접근가능
//		p1.name = "홍길동";
//		System.out.println(p1.name);
		
		p1.setName("홍길동");
		System.out.println(p1.getName());
		People p2 = new People("이순신", 90);
		
		//현재 날짜가 12월 31일 00시면 
		if(true) {
			System.out.println(p1.ageUp());
			
		
		}
		
	
		
	}
}