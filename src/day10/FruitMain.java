package day10;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f = new Fruit();
		f.name = "사과";
		f.isSeed = true;
		f.removeSeed();
		System.out.println(f.name+" / "+f.isSeed);
		
		Fruit2 f2 = new Fruit2();
		f2.color = "빨강";
		f2.name = "사과";
		System.out.println(f2.name+" / "+f2.isSeed+" / "+f2.color);
	}
	
}


class Fruit{
	String name;
	boolean isSeed;
	
	public void removeSeed() {
		isSeed = false;
	}
}

class Fruit2 extends Fruit{
//	String name;   //extends 상속받을때 씀 내용 그대로 적용가능
//	boolean isSeed;
	String color;
	
//	public void removeSeed() {
//		isSeed = false;
//	}
	public void colorChange(String color) {
		this.color = color;
	}
	

	
}