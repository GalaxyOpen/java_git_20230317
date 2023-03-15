package day10_1;
//추상 클래스 - 한개이상의 추상메소드가 있는거
public abstract class Animal {
	String name;
	
	public Animal() {
		
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	//추상메소드 중간괄호없음{} 각 메소드마다 실행문구가 다를거기 때문 (자식클래스에서 무조건 오버라이딩해야함)
//	public abstract void cry();
	
	public String getName() {
		return this.name;
	}
	
	public abstract String cry();
	
	
	public abstract String move();
	
	
	public abstract  String food();
	
	
	public abstract void print();
	
}	

	
