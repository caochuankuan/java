public class showstatic{
	public static void main(String[] args){
		staticdemo a=new staticdemo();
		staticdemo b=new staticdemo();
		a.setx(1);
		a.sety(2);
		b.setx(3);
		b.sety(4);
		System.out.println("a.x="+a.getx());
		System.out.println("a.y="+a.gety());
		System.out.println("b.x="+b.getx());
		System.out.println("b.y="+b.gety());
		System.out.println(staticdemo.x);
	}
}

class staticdemo{
	static int x;
	int y;
	public static int getx(){
		return x;
	}
	public int setx(int newx){
		x=newx;
		return x;
	}
	public int gety(){
		return y;
	}
	public void sety(int newy){
		y=newy;
	}
}