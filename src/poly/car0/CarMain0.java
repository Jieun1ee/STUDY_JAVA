<<<<<<< HEAD
package poly.car0;

public class CarMain0 {

    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();

        driver.setK3Car(k3Car);
        driver.drive();

        //추가
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null);
        driver.setModel3Car(model3Car);
        driver.drive();
    }
=======
package poly.car0;public class CarMain0 {
>>>>>>> a9b1a69cd535fa5c0cad28b44c5b7d0bad91ae4c
}
