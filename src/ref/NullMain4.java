package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count = " + bigData.count); //0
        System.out.println("bigData.data = " + bigData.data); //참조값

        //NullPointerExceotion Error
        System.out.println("bigData.data.value = " + bigData.data.value); //0
    }
}