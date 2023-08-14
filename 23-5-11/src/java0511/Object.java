package java0511;
abstract class shape {
	private int num;
	public String name;
	public abstract void area();
	public abstract void c();
	public abstract void side_angle();
	shape(int l) {
		setNum(l);
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
class triangle extends shape {
	double h = 4;
	double botton = 3;
	double botton1 = 4;
	double botton2 = 5;
	int angle = 4;
	String name = "我是三角形";
	triangle() {
		super(3);
	}
	public void side_angle() {
		System.out.println("我有"+getNum()+"条边!分别是"+(int)botton+" "+(int)botton1+" "+(int)botton2+" \n高是"+(int)h+"(最短边上的高)\n我有"+angle+"个角");
	}
	public void area() {
		double area = h * botton * 0.5;
		System.out.println("\n我的面积:" + area);
	}
	public void c(){
		double c = botton + botton1 +botton2;
		System.out.println("我的周长:"+c);
	}
}
public class Object {
	public static void main(String[] args) {
		shape s = new triangle();
		String ii = ((triangle) s).name;
		System.out.println(ii);
		s.side_angle();
		s.area();
		s.c();
	}
}