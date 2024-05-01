<<<<<<< HEAD
package poly.car1;

public class Driver {

    private Car car;

    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다 : " + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressEngine();
        car.offEngine();
    }
=======
package poly.car1;public class Driver {
>>>>>>> a9b1a69cd535fa5c0cad28b44c5b7d0bad91ae4c
}
