package static2.ex;

import java.util.Arrays;

public class MathArrayUtils {
    
    private MathArrayUtils() {
        //private 인스턴스 생성을 막는다.
    }
    

    public static int sum(int[] valeus) {
        return Arrays.stream(valeus).sum();
        
        // 정답 코드
//        int total = 0;
//        for (int value : valeus) {
//            total += value;
//        }
//        return total;
    }

    public static double average(int[] values) {
        
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        return Arrays.stream(values).min().getAsInt();

        // 정답 코드
//        int minValue = values[0];
//        for (int value : values
//        ) {
//            if (value < minValue) {
//                minValue = value;
//            }
//        }
//        return minValue;
    }

    public static int max(int[] values) {
        return Arrays.stream(values).max().getAsInt();

        // 정답 코드
//        int maxValue = values[0];
//        for (int value : values
//        ) {
//            if (value > maxValue) {
//                maxValue = value;
//            }
//        }
//        return maxValue;
    }
}
