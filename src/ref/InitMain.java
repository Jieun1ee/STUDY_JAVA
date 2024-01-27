package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1); //초기화하지 않았으니 값이 0이 됨.
        System.out.println("value2 = " + data.value2); //10
    }
}
