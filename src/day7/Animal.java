package day7;

public class Animal {
	//private 같은 클래스(창?) 안에서만 사용가능)
	//외부에서 접근하지 못하게 막는것(값 멋대로 변경 못하게)
	String test;
	private String name;
	private String sound;
	private int leg;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; //자기자신(자기객체)을 말할때 this 자기자신의 이름을 넣어줘라
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void ageUp() {
		age += 1;
	}
	
	
	public void print() {
		System.out.printf("다리가 %d개인 %s는 %s웁니다\n",leg, name, sound);
	}
	
	
	
	
	
	
	
}
