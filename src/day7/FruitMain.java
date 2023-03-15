package day7;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		
		
		
		Fruit apple = new Fruit();
		apple.setName("사과");
//		System.out.println(apple.getName());
		apple.color = "빨강";
		apple.isSeed = true;
		System.out.println(apple.getName()+apple.color+apple.isSeed);
		
		Fruit apple1 = new Fruit("사과", "빨강", true);
		System.out.println(apple1.getName()+apple1.color+apple1.isSeed);
		//필드에 값을 집어넣으면서 객체를 생성하고 싶을 때 기본생성자 사용.
		//
		
		
		Fruit banana = new Fruit();
		banana.setName("바나나");
		banana.color = "노랑";
		banana.isSeed = false;
		
		Fruit melon = new Fruit("멜론", "초록", true);
		
		
		
		Fruit orange = new Fruit();
		orange.setName("오렌지");
		orange.color = "주황";
		orange.isSeed = true;
		
		Fruit pear = new Fruit("배");
		System.out.println(pear.getName());
		
		
		
	}

}
