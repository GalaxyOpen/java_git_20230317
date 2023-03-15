package day10;

public class TvMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv2 tv2 = new Tv2();
		tv2.power = true;
		tv2.channel = 10;
		tv2.volum = 20;
		tv2.power();
		tv2.channelUp();
		tv2.channelUp();
		tv2.channelDown();
		tv2.channelDown();
		
		System.out.println(tv2.power+" / "+tv2.channel+" / "+tv2.volum);
		
		Tv tv = new Tv();
		tv.power = false;
		tv.channel = 10;
//		tv.volum = 9; 에러남. 자식은 부모껏을 상속받을수있지만 부모는 자식꺼 못씀 / 상속을 두군데에서 받을수없음
	}

}
class Tv{
	boolean power;
	int channel;
	
	public void power() {
		this.power = !power;
	}
	public void channelUp() {
		this.channel++;
	}
	public void channelDown() {
		this.channel--;
	}
}
class Tv2 extends Tv{
	int volum;
	
	public void volunUp() {
		volum++;
	}
	public void volumDown() {
		volum--;
	}
}