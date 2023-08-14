package java0510;

abstract class animal{
	private int lengnum;
	animal(int l){
		lengnum=l;
	}
	public abstract void makesound();
}

class fish extends animal{
	fish(){
		super(0);
	}
	public void makesound(){
		System.out.println("fish make sound!");
	}
}

public class Test {
	public static void main(String[] args) {
		animal aa = new fish();
		aa.makesound();
	}
}
