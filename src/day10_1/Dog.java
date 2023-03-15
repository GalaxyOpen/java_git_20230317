package day10_1;

public class Dog extends Animal{
	String cry;
	String move;
	String food;
	 
	
	@Override
	public String cry() {
		return cry;
	}

	@Override
	public String move() {
		return move;
	}
//
//	@Override
//	public void cry() {
//		// TODO Auto-generated method stub
//		System.out.println("멍멍");
//	}

	@Override
	public String food() {
		return food;
	}

	@Override
	public void print() {
		System.out.println(getName()+" / "+cry+" / "+move+" / "+food);
	}



}
