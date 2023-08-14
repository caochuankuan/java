import java.util.*;

public class parentchildconstrcutor {
    public static void main(String[] args) {
        child child = new child();
    }
}

class child extends parent {
    child() {
        super(10);
        System.out.println("child constructed function");
    }
}

class parent {
    int i = 0;

    parent(int num) {
        i = num;
        System.out.println("parent constructed function,i=" + i);
    }
}
