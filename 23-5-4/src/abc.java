import java.io.*;

public class abc {
    public static void main(String[] args) {
        SubClass sb = new SubClass();
        System.out.println(sb.max());
    }
}

class SuperClass {
    int a = 10, b = 20;
}

class SubClass extends SuperClass {
    int max() {
        return ((a > b) ? a : b);
    }
}

