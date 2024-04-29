package poly.diamond;

public class DiamondMain {

    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();

        //자기자신
        Child c = new Child();
        c.methodCommon();
    }
}
