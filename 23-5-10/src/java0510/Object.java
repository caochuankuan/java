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
	String introduce = "��Һ�";
	public void name(){
		System.out.println("�ҽ�������!");
	}
	public void side(){
		System.out.println("����������!");
	}
	public void angle(){
		System.out.println("����������!");
	}
	public void features(){
		System.out.println("�Ҿ����ȶ���!");
	}
	public void area(){
		System.out.println("�ҵ���������ú��׹�ʽ����!");
	}
	public void circumference(){
		System.out.println("�ҵ��ܳ�ֱ��������Ӽ���!");
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
