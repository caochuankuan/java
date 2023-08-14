import java.io.*;
import java.util.Scanner;
public class yunsuan{
	public static void main(String[] args){
		int n1,n2;
		Scanner in = new Scanner(System.in);
		System.out.print("请输入第一个整数n1:");
		n1=in.nextInt();
		System.out.print("请输入第二个整数n2:");
		n2=in.nextInt();
		System.out.println("n1+n2="+(n1+n2));
		System.out.println("n1-n2="+(n1-n2));
		System.out.println("n1*n2="+(n1*n2));
		System.out.println("n1/n2="+(n1/n2));
		System.out.println("n1%n2="+(n1%n2));
	}
}