package day10_1;

public class Cat extends Animal{
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

	@Override
	public String food() {
		return food;
	}

	@Override
	public void print() {
		System.out.println(getName()+" / "+cry+" / "+move+" / "+food);
		
	}

}
