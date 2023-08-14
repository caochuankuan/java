package java20601;

public class jiecheng {
	public static void main(String[] args) {
		int sum = 0, i, j;
		for (i = 1; i <= 10; i++) {
			int s = 1;
			for (j = 1; j <= i; j++) {
				s = s * j;
			}
			sum = sum + s;
		}
		System.out.println("1!+2!+3!+...+10!=" + sum);
	}
}
