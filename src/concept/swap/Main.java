package concept.swap;

/**
 * Created by hemants on 26/09/18.
 *
 * In java parameters are always passed as value. So When we call swap function, address references from car1 and car2 is
 * copied to c1 and c2 and passed to it.
 *
 * To actually make swap work we need wrapper class which holds the refereces.
 *
 */

class CarWrapper {
    Car car;
    CarWrapper(Car car){
        this.car = car;
    }
}

class Car {
    String name;
    Car(String name){
        this.name  = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("swift");
        Car car2 = new Car("maruti");

        swap(car1,car2);

        System.out.println("After swap car 1 : " + car1.name + ", car 2 :" + car2.name);

        System.out.println("But wrapper call make swap works");

        CarWrapper cw1 = new CarWrapper(car1);
        CarWrapper cw2 = new CarWrapper(car2);

        swap(cw1, cw2);

        System.out.println("After swap car 1 : " + cw1.car.name + ", car 2 :" + cw2.car.name);

    }

    public static void swap(Car c1, Car c2){
        Car temp = c1;
        c1 = c2;
        c2 = temp;
    }

    public static void swap(CarWrapper c1, CarWrapper c2){
        Car temp = c1.car;
        c1.car = c2.car;
        c2.car = temp;
    }
}
