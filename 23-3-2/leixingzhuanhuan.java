public class leixingzhuanhuan{//类型转换
	public static void main(String[] args){
		int i='A';
		byte b=6;
		short s=b;
		float f=i;
		double d=f;
		double result=b+s+f+d;
		int score=(int)(90.5f);
		float area=(float)(3.14*2*2);
		System.out.println("i="+i);
		System.out.println("b="+b);
		System.out.println("s="+s);
		System.out.println("f="+f);
		System.out.println("d="+d);
		System.out.println("result="+result);
		System.out.println("score="+score);
		System.out.println("area="+area);
	}
}