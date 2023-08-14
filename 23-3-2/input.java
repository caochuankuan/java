import java.io.*;
import java.util.Scanner;
public class input{
	public static void main(String[] args){
		int j,m;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数:");
		int i = input.nextInt();
		j=i++;
		m=++i;
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("m="+m);
	}
}