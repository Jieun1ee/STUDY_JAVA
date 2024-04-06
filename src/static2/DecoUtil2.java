package static2;

public class DecoUtil2 {

    // 정적 메소드 -> 인스턴스 생성 없이 클래스 명으로 바로 호출이 가능
    public static String deco(String str) {
        return "*" + str + "*";
    }
}
