<<<<<<< HEAD
package poly.ex.pay1;

public class KakaoPay implements Pay{

    @Override
=======
package poly.ex.pay0;

public class KakaoPay{

>>>>>>> a9b1a69cd535fa5c0cad28b44c5b7d0bad91ae4c
    public boolean pay(int amount) {
        System.out.println("카카오페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}
