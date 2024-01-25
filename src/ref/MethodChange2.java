package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("매서드 호출 전: dataA.value = " + dataA.value); // 10
        System.out.println("dataA = " + dataA); //같은 참조값
        changeReference(dataA);
        System.out.println("매서드 호출 후: dataA.value = " + dataA.value); // 20
    }

    public static void changeReference(Data dataX) {
        System.out.println("dataX = " + dataX); //같은 참조값
        dataX.value = 20;
    }
}