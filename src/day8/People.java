package day8;

public class People {

	private String name;
	private int age;
	
	public People() {          // 기본생성자 생성, 클래스 이름과 동일
	}
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int ageUp() {
		this.age++;
		return this.age;
	}
}
