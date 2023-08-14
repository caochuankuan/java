import java.io.*;
import java.util.Scanner;
public class switcha{
	public static void main(String[] args){
		char grade;
		System.out.print("please input:");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		switch(a){
			case 1:System.out.println("1");break;
			case 2:System.out.println("2");break;
			case 3:System.out.println("3");break;
			case 4:System.out.println("4");break;
			default:System.out.println("5");break;
		}
	}
}