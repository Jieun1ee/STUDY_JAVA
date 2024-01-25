package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조값 = " + dataA);
        System.out.println("dataB 참조값 = " + dataB); //둘 다 같은 참조값. 참조값만 복사하는 것
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        // dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value); //dataB도 20

        // dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataA.value = 30");
        System.out.println("dataA.value = " + dataA.value); //dataA도 30
        System.out.println("dataB.value = " + dataB.value);
    }
}
