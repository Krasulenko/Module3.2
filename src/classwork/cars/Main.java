package classwork.cars;

import classwork.cars.Car;

public class Main {
    public static void main(String[] args) {
        int a;
        Car honda1 = new Car(2009, "civic");
        Car honda2 = new Car(2008, "accord", 10000, "Jack");

        honda2.printOwnerName();
        honda1.printYear();
    }
}
