public class Sum {
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 1; i < 100; i++)
            sum += 1.0 / (double) i;
        System.out.println("sum=" + sum);
    }
}
