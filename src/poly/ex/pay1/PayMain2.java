package poly.ex.pay1;

<<<<<<< HEAD
import java.util.Scanner;

public class PayMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.println("결제 수단을 입력하세요.");
            String payOption = scanner.nextLine();

            if (payOption.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            System.out.println("결제 금액을 입력하세요.");
            int amount = scanner.nextInt();
            scanner.nextLine(); //\n

            payService.processPay(payOption, amount);
        }
=======
public class PayMain1 {

    public static void main(String[] args) {
        PayService payService = new PayService();

        //kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        //naver 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        //잘못된 결제 수단 선택
        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);
>>>>>>> a9b1a69cd535fa5c0cad28b44c5b7d0bad91ae4c
    }
}
