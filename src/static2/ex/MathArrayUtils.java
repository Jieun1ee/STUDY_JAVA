package static2.ex;

import java.util.Arrays;

public class MathArrayUtils {

    public static int sum(int[] valeus) {
        return Arrays.stream(valeus).sum();
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        return Arrays.stream(values).min().getAsInt();
    }

    public static int max(int[] values) {
        return Arrays.stream(values).max().getAsInt();
    }
}
