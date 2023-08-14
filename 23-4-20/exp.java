class a{
	public void func1(){
		System.out.println("a func1 is calling");
	}
	public void func2(){
		func1();
	}
}
class b extends a{
	public void func1(){
		System.out.println("b func1 is calling");
	}
	public void func3(){
		System.out.println("b func3 is calling");
	}
}
public class exp{
	public static void main(String[] args){
		b b1=new b();
		a a1=b1;
		calla(a1);
		calla(new b());
	}
	public static void calla(a a1){
		a1.func1();
		a1.func2();
	}
}