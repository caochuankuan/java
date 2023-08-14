import java.io.*;
import java.util.Scanner;
public class year{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("请输入年份：");
		int a = in.nextInt();
		boolean year=((a%4==0&&a%100!=0)||a%400==0);
		if(year){
			System.out.println(a+"年是闰年");
		}else{
			System.out.println(a+"年不是闰年");
		}
	}
}