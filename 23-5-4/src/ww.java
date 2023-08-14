import java.io.*;

public class ww {
    public static void main(String[] args) {
        int i, s = 0;
        int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        for (i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0) {
                s += a[i];
            }
        }
        System.out.println("s=" + s);
    }
}
