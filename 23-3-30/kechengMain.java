class kecheng{
	static String name;
	int xueshi;
	void nameinfo(String n){
		name=n;
		System.out.println("name:"+name);
	}
}

class math extends kecheng{
	private static int num=0;
	String feature;
	public math(){
		num++;
	}
	static void count(){
		System.out.println("\ncount:"+num);
	}
}

class kechengMain{
	public static void main(String[] args){
		math c1 = new math();
		c1.count();
		c1.nameinfo("math");
		c1.feature = "luojisiwei";
		System.out.println("feature:"+c1.feature);
		math c2 = new math();
		c2.count();
		c1.nameinfo("testclass");
		c2.feature = "test";
		System.out.println("feature:"+c2.feature);
	}
}