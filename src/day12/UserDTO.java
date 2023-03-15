package day12;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import day12.UserDTO;

public class UserDTO {
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	private static String domain = "naver.com";
	private String email;
	private String password;
	private String name;
	private int age;
	private String joinDate;

	public UserDTO() {
		this.joinDate = DTF.format(LocalDateTime.now());
	}

	public static String getDomain() {
		return domain;
	}

	public static void setDomain(String domain) {
		UserDTO.domain = domain;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email + "@" + domain;
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

	@Override
	public String toString() {
		return email + "\t" + password + "\t" + name + "\t" + age + "\t"  + joinDate;
	}
}
