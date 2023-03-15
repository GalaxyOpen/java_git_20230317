package day10;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person person = new Person("홍길동", 99, false);
		Student s = new Student("홍길동", 99, "S100");
		
	}

}
class Person{
	String name;
	int age;
//	boolean isFull; //배가 부른지 안부른지
	
	public Person() {
		System.out.println("Person기본생성자");
	}
	public Person(String name) {
		this.name = name;
		System.out.println("Person기본생성자1");
	}
	public Person(String name, int age) {
//		this.name = name;
		this(name); //public Person(String name) 을 호출함
		this.age = age;
		System.out.println("Person기본생성자2");
	}
//	public Person(String name, int age, boolean isFull) {
////		this.name = name;
////		this.age = age;
//		this(name, age); //public Person(String name, int age) 을 호출함
//		this.isFull = isFull;
//		System.out.println("Person기본생성자3");
//	}
	
}
class Student extends Person{
	String sno;
	
	public Student() {
//		super(); 부모에 대한 기본생성자가 만들어져있음 //this는 자기자신 super는 부모
		System.out.println("Student 기본생성자");
	}

	public Student(String name, int age, String sno) {
		super(name, age); //생성자는 무조건 첫번째줄 기재
		this.sno = sno;
		System.out.println("Student 기본생성자2");
	}
}
// 생성자는 무조건 첫줄 //자식에는 부모의 기본생성자가 자동으로 기재되어있음(숨겨져있음)


