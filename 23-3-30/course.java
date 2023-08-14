class coursef{
	String name;
	int redit;
	coursef(String name,int redit){
		this.name=name;
		this.redit=redit;
	}
	void show(){
		System.out.println(name);
		System.out.println(redit);
	}
}

class maths extends coursef{
	String feature;
	maths(String n,int r,String f){
		super(n,r);
		this.feature=f;
		System.out.println("name:"+name+"\nredit:"+redit+"\nfeature:"+feature);
	}
}


public class course{
	public static void main(String[] args){
		maths m = new maths("math",6,"luojisiwei");
	}
}