import java.io.*;
import java.util.Scanner;
public class shuru{
	public static void main(String[] args){
		
		//0.字符
		System.out.print("please input char:");
		Scanner in0 = new Scanner(System.in);
		char str0 = in0.next().charAt(0);//string str0 = in0.next();char c =str0.charAt(0);
		System.out.println("string:"+str0+"\n");
		
		//1.字符串
		System.out.print("please input str:");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println("string:"+str+"\n");
		
		//2.字符串
		System.out.print("please input str:");
		Scanner in1 = new Scanner(System.in);
		String str1 = in1.nextLine();
		System.out.println("string:"+str1+"\n");
		
		//3.整型
		System.out.print("please input int:");
		Scanner in2 = new Scanner(System.in);
		int int1 = in2.nextInt();
		System.out.println("int:"+int1+"\n");
		
		//4.long整型
		System.out.print("please input long int:");
		Scanner in5 = new Scanner(System.in);
		long l = in5.nextLong();
		System.out.println("long int:"+l+"\n");
		
		//5.short整型
		System.out.print("please input short:");
		Scanner in6 = new Scanner(System.in);
		short s = in5.nextShort();
		System.out.println("short int:"+s+"\n");
		
		//6.double
		System.out.print("please input double:");
		Scanner in3 = new Scanner(System.in);
		double d = in3.nextDouble();
		System.out.println("double:"+d+"\n");
		
		//7.float
		System.out.print("please input float:");
		Scanner in4 = new Scanner(System.in);
		float f = in4.nextFloat();
		System.out.println("float:"+f+"\n");
		
		//8.boolean
		System.out.print("please input boolean:");
		Scanner in7 = new Scanner(System.in);
		boolean b = in7.nextBoolean();
		System.out.println("boolean:"+b+"\n");
		
		//9.byte
		System.out.print("please input byte:");
		Scanner in8 = new Scanner(System.in);
		byte byte1 = in8.nextByte();
		System.out.println("byte:"+byte1+"\n");
	}
}