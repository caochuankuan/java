import java.io.*;
import java.util.Scanner;
public class dengji{
	public static void main(String[] args){
		char grade;
		System.out.print("please input your score:");
		Scanner in = new Scanner(System.in);
		double score = in.nextDouble();
		if(score>100 || score<0){
			System.out.println("you sure?");
		}else{
			if(score>=90 && score <=100){
				grade='a';
			}else if(score>=80){
				grade='b';
			}else if(score>=70){
				grade='c';
			}else if(score>=60){
				grade='d';
			}else{
				grade='e';
			}
			System.out.println(grade);
		}
		}		
}