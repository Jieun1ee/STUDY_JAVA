package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count = " + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count = " + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count = " + data3.count);

        //출력값 모두 1
        //인스턴스에서 사용되는 멤버변수 Count의 값은 인스턴스끼리 공유되지 않음
    }
}
