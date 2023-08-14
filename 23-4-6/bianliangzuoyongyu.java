class a{
	static int x;
	int y;
	void setx(int x0){x=x0;}
	void sety(int y0){y=y0;}
	void showx(){System.out.println("x="+x);}
	void showy(){System.out.println("y="+y);}
}

public class bianliangzuoyongyu {
    public static void main(String[] args){
    	a a1 = new a();
    	a a2 = new a();
    	System.out.println("set the answer of number x and y by a1");
    	a1.setx(1);
    	a1.showx();
    	a2.showx();
    	a1.sety(2);
    	a1.showy();
    	System.out.println("set the answer of number x and y by a2");
    	a2.setx(3);
    	a1.showx();
    	a2.showx();
    	a2.sety(4);
    	a1.showy();
    	a2.showy();
    } 
}