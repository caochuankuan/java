package java20601;

import java.util.Scanner;

public class aaa {
	public static void main(String[] args) {
		int a, b, i, sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("��������a��ֵ��");
		a = in.nextInt();
		System.out.print("������ӵ�������");
		b = in.nextInt();
		int num = a;
		for (i = 1; i <= b; i++) {
			sum = sum + num;
			num = num * 10 + a;
		}
		System.out.println("����֮�ͣ�" + sum);
	}
}
