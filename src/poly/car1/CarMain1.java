<<<<<<< HEAD
package poly.car1;

public class CarMain1 {

    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택(K3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        //차량 변경(K3 -> Model3)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        //차량 변경(Model3 -> NewCar)
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
=======
package poly.car1;public class CarMain1 {
>>>>>>> a9b1a69cd535fa5c0cad28b44c5b7d0bad91ae4c
}
