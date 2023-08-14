package java0510;

abstract class shape{
	private int num;
	shape(int l){
		num=l;
	}
	public abstract void name();
	public abstract void side();
	public abstract void angle();
	public abstract void features();
}

class triangle extends shape{
	triangle(){
		super(3);
	}
	String introduce = "大家好";
	public void name(){
		System.out.println("我叫三角形!");
	}
	public void side(){
		System.out.println("我有三条边!");
	}
	public void angle(){
		System.out.println("我有三个角!");
	}
	public void features(){
		System.out.println("我具有稳定性!");
	}
	public void area(){
		System.out.println("我的面积可以用海伦公式计算!");
	}
	public void circumference(){
		System.out.println("我的周长直接三边相加计算!");
	}
}

public class Object {
	public static void main(String[] args) {
		shape s = new triangle();
		String ii=((triangle)s).introduce;
		System.out.println(ii);
		s.name();
		s.side();
		s.angle();
		s.features();
		((triangle)s).area();
		((triangle)s).circumference();
	}
}
