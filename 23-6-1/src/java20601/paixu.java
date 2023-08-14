package java20601;

import java.util.Scanner;

public class paixu {
	public static void main(String[] args) {
		int[] a = new int[10];
		int i, j, temp;
		System.out.println("请输入十个整数：");
		Scanner in = new Scanner(System.in);
		for (i = 0; i < 10; i++) {
			a[i] = in.nextInt();
		}
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10 - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < 10; i++) {
			System.out.print(a[i] + "  ");
		}
	}
}
