import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

class ClassA {
    ClassA() {
        System.out.println("A");
        this.prn();
    }

    void prn() {
        System.out.println("B");
    }
}

class ClassB extends ClassA {
    ClassB() {
        super();
        System.out.println("D");
    }

    void prn() {
        System.out.println("E");
    }

    void prn(int x) {
        System.out.println(x);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int x = 7;
        ClassB cal = new ClassB();
        System.out.println("--");
        cal.prn(7);
    }
}