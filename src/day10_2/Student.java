package day10_2;

public class Student extends Person{
	private static int number = 100;
	
	private String sno;
	private String tName; //지도교수번호
	private double avg;
	private String dept; //학과
	
	public Student() {
		this.sno = "S"+number++;
	}
	public String getTname() {
		return tName;
	}
	public void setTname(String tName) {
		this.tName = tName;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void print() {
		System.out.printf("%s\t%s\t%c\t%s\t%s\t%s\t%.2f\t%s\n",getId(),getName(),getGender(),getBirthday(),sno,tName,avg,dept);
	}
	
	
	
	
}
