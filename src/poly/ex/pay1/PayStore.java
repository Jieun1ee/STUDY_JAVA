<<<<<<< HEAD
package poly.ex.pay1;

public abstract class PayStore {

    //결제 수단 추가 시에 변하는 부분
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
    }
=======
package poly.ex.pay1;public class PayStore {
>>>>>>> a9b1a69cd535fa5c0cad28b44c5b7d0bad91ae4c
}
