public class staticapp{
	public static void main(String[] args){
		Cylinder volu1=new Cylinder(3.5,7);
		volu1.count();
		System.out.println("mianji="+volu1.volume());
		Cylinder volu2=new Cylinder(2.0,3);
		volu2.count();
		System.out.println("mianji="+volu2.volume());
	}
}
class Cylinder{
	private static int num=0;
	private static double pi=3.14;
	private double radius;
	private int height;
	
	public Cylinder(double r,int h){
		radius=r;
		height=h;
		num++;
	}
	
	public void count(){
		System.out.println("created "+num+" object:");
	}
	double area(){
		return pi*radius*radius;
	}
	double volume(){
		return area()*height;
	}
}