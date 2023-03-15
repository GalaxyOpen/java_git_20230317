package day11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserDTO {
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	private static String domain = "naver.com";
	private String email;
	private String password;
	private String name;
	private int age;
	private String joinDate; // 가입일

	public UserDTO() {

		this.joinDate = DTF.format(LocalDateTime.now());

	}

	public UserDTO(String email, String password, String name, int age) {
		this(); // 기본생성자를 사용하겠다
		//// this.joinDate = DTF.format(LocalDate.now()); 위에꺼 쓰면 이거 안써도됨
		this.email = email + "@" + domain;
		this.password = password;
		this.name = name;
		this.age = age;
	}

	// 스태틱 메소드는 (=정적메소드)는 클래스에 붙어서 사용함 객체를 찍어낼떄 따로 찍지않고 클래스에붙어서 다 공유되어 사용된다
	// 스태틱 안에서는 자기자신 this를 사용할수없다 --->공통으로 쓰는 메소드이기 때문에

	public static String getDomain() {
		return domain;
	}

	public static void setDomain(String domain) {
		UserDTO.domain = domain;
		// 도메인은 공통으로 다 공유하는거니까 스태틱으로 사용가능하다
		// 도메인은 @ 포함이 안되서 따로 써준다
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJoinDate() {
		return joinDate;
	}
//보통 투스트링은 객체에대한 정보를 보고싶을때 사용한다

	// 오브젝트
	public String toString() {
		return email + "\t" + password + "\t" + name + "\t" + age + "\t" + joinDate + "\n";
	}

}
