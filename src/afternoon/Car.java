package afternoon;

import java.util.Date;

public class Car {

    //    State -> fields -> members
    int speed;
    String color;
    Date mfg;
    boolean isEv;

    //    Behaviour -> methods

    void speedUp() { }
    void applyBreaks() { }
}

class CarMain {
    public static void main(String[] args) {

        Car c1 = new Car();

        Car c2 = new Car();

        Car c3 = new Car();
    }
}
