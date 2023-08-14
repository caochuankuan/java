import java.io.*;
import java.util.Scanner;
public class bijiao{
	public static void main(String[] args){
		int i,j;
		Scanner in = new Scanner(System.in);
		System.out.print("请输入第一个整数,i=");
		i = in.nextInt();
		System.out.print("请输入第二个整数,j=");
		j = in.nextInt();
		if(i>j){
			System.out.println("i>j");
		}else if(i==j){
			System.out.println("i=j");
		}else{
			System.out.println("i<j");
		}
	}
}