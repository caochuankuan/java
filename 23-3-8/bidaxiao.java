import java.io.*;
import java.util.Scanner;
public class bidaxiao{
	public static void main(String[] args){
		Scanner in1 = new Scanner(System.in);
		System.out.print("please input the first number:");
		int first = in1.nextInt();
		Scanner in2 = new Scanner(System.in);
		System.out.print("please input the second number:");
		int second = in2.nextInt();
		int third=first-second;
		System.out.println("first-second="+third);
		System.out.println("first+second="+(first+second));
		System.out.println("first*second="+first*second);
		System.out.println("first/second="+first/second);
		System.out.println("first%second="+first%second);
	}
}