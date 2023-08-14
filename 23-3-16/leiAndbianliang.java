class hello{
	String s="hello!";
	public hello(String s){
		System.out.println("s="+s);
		System.out.println("1->this.s="+this.s);
		this.s=s;
		System.out.println("2->this.s="+this.s);
	}
}

class hello1{
	String s="hello!";
	public hello1(String s){
		System.out.println("s="+s);
		System.out.println("1->this.s="+this.s);
		//this.s=s;
		System.out.println("2->this.s="+this.s);
	}
}

public class leiAndbianliang{
	public static void main(String[] args){
		hello x = new hello("helloworld!");
		System.out.println("s="+x.s);
		System.out.println();
		hello1 y = new hello1("java!");
		System.out.println("s="+y.s);
	}
}