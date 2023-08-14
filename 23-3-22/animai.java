class one{
	String name;
	double weight;
	int age;
	void speak(String language){
		System.out.println("one say:"+language);
	}
	void eat(String food){
		System.out.println("one eat:"+food);
	}
}

class one_son extends one{
	String hand;
	String foot;
	int height;
	void speak(String language){
		System.out.println("one_son say:"+language);
	}
	public static void main(String[] args){
	one_son s1 = new one_son();
		s1.weight=70;
		System.out.println("(extends)weight:"+s1.weight);
		s1.height=170;
		System.out.println("(one_son)height:"+s1.height);
		s1.speak("hello world(one_son)");
		s1.eat("mango(extends)");
	}
}