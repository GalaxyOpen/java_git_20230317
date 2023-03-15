package day7;

public class Fruit {
	private String name;
	String color;
	boolean isSeed;
	// 생성자 특징 1. 리턴타입이 없다.
	//           2. 생성자 명이 클래스 이름과 동일하다. (따로 작성안해도 기본적으로 작성되어있음 숨겨짐 = 기본생성자)
	// ex) public Fruit(){ System.out.println("기본생성자")};
	//생성자: 모든 클래스에 반드시 하나이상 존재하며, 객체를 생성할 때 사용
	// 매개변수가 다르면 똑같은 메소드 이름을 사용할 수 있음.(오버로딩)

	//***면접필수질문***
	//생성자 오버로딩: 매개변수를 다르게 하는 생성자를 여러개 선언 하는것, 순서를 다르게 해도 가능
	//Car c1=new Car(); Car c2=new Car("미쉘린");
	
	
	public Fruit() {
		System.out.println("기본생성자입니다");
	}
	public Fruit(String name) {
		this.name = name;
	}
	public Fruit(String name, String color) {
		this.name = name;
		this.color = color;
	}
	

	public Fruit(String name, String color, boolean isSeed) {
		System.out.println("생성자1");
		this.name = name;
		this.color = color;
		this.isSeed = isSeed;
	}
	public Fruit(String name, boolean isSeed, String color) {
		
	}
	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
}
