<<<<<<< HEAD
package poly.ex.pay1;
=======
package poly.ex.pay0;
>>>>>>> a9b1a69cd535fa5c0cad28b44c5b7d0bad91ae4c

public class PayService {

    public void processPay(String option, int amount) {
<<<<<<< HEAD
        System.out.println("결제를 시작합니다 : option = " + option + ", amount = " + amount);

        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);
=======
        boolean result;
        System.out.println("결제를 시작합니다 : option = " + option + ", amount = " + amount);
        if (option.equals("kakao")) {
            KakaoPay kakaoPay = new KakaoPay();
            result = kakaoPay.pay(amount);
        } else if (option.equals("naver")) {
            NaverPay naverPay = new NaverPay();
            result = naverPay.pay(amount);
        } else {
            System.out.println("결제 수단이 없습니다.");
            result = false;
        }
>>>>>>> a9b1a69cd535fa5c0cad28b44c5b7d0bad91ae4c

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}