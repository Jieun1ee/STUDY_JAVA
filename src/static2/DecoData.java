package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근

        //instanceValue++; //인스턴스 변수 접근, compile error
        //instanceMethod(); //인스턴스 메서드 접근, compile error
    }

    public void instanceCall() {
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    // 외부에서 참조값 넘겨오기 때문에 가능
    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }
    private void instanceMethod(){
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticMethod = " + staticValue);
    }
}
