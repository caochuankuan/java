public class one{
	public String name;
	public String weight;
	public int age;
	public void speak(String language){
		System.out.printlnn("one say:"+language);
	}
	public void eat(String food){
		System.out.printlnn("one eat:"+food);
	}
}

public class one_son extends one{
	public String hand;
	public String foot;
	public String height;
	public void speak(String language){
		System.out.println("one_son say:"+language);
	}
	public static void main(String[] args){
		one_son s = new one_son();
		System.out.println("*************************************");
		s.weight="70kg";
	}
}