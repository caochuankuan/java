import java.io.*;
import java.util.Scanner;
public class jige{
	public static void main(String[] args){
		char c='a';
		System.out.print("please inout a char:");
		try{
			c=(char)System.in.read();
		}
		catch(IOException e){
			System.out.println(e);			
		}
		System.out.println("your letter is:"+c);
	}
}