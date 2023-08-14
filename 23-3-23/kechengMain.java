class kecheng{
	String name;
	int xueshi;
	void printinfo(String name,int xueshi){
		System.out.println("name:"+name+"\nxueshi:"+xueshi);
	}
}

class math extends kecheng{
	String feature;
}

class kechengMain{
	public static void main(String[] args){
		math c1 = new math();
		c1.printinfo("math",6);
		c1.feature = "luojisiwei";
		System.out.println("feature:"+c1.feature);
	}
}