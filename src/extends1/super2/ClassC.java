package extends1.super2;

public class ClassC extends ClassB{

    public ClassC() {
        super(10, 20);
        //super를 생략할 수 있는 경우는 기본 생성자인 경우에만
        //기본 생성자가 없으면 직접 호출 해야함.
        System.out.println("ClassC 생성자");
    }
}
