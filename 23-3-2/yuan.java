import java.io.*;
import java.util.Scanner;
public class yuan{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("请输入圆的半径");
		double r = in.nextInt();
		System.out.println("圆的周长:"+(2*3.14*r));
		System.out.println("圆的面积:"+(3.14*r*r));
	}
}