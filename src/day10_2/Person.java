package day10_2;

public class Person {
	private static int number = 10000;
	
	private String id;//주민등록번호 생년월일 990416-1100002 뒤에 한자리 랜덤
	private String name;
	private char gender;
	private String birthday;
	
	
	public String getId() {
		return id;
	}
	public void setId() {
		if(!(gender == 0 || birthday == null)) {
			int firstNo = (gender == 'M')? 1 : 2; //삼항연산자 변수선언 = (조건식)? 참이면 실행구 : 거짓이면 실행구 (대입할때 실행함 if대신 아님)
			int random = (int)(Math.random()*9)+1;
			this.id = birthday+"-"+firstNo+number++ +random;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
}
