import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int x = sc.nextInt();
        int y = sc.nextInt();

        int K = sc.nextInt();

        int[][] map = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        int[] dir = new int[K];
        for (int i = 0; i < K; i++) {
            dir[i] = sc.nextInt();
        }
    }


}