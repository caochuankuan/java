class a{
	int x=2,y=3;
	double add(){
		return x+y;
	}
}
class b extends a{
	int x=20,y=30;
	double add(){return super.x+super.y;}
	double addB(){return x+y;}
	double addA(){return super.add();}
}
public class chongxie{
	public static void main(String[] args){
		a aa=new a();
		b bb=new b();
		System.out.println(bb.add());
		System.out.println(aa.add());
		System.out.println(bb.addA());
		System.out.println(bb.addB());
		
	}
}