import java.io.*;

public class aa {
    public static void main(String[] args) {
        int i, n = 10;
        int[] a = new int[10];
        for (i = 0; i < n; i++)
            try {
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(System.in));
                a[i] = Integer.parseInt(br.readLine()); // 输入一个整数
            } catch (IOException e) {
            }
        for (i = n - 1; i >= 0; i--)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
