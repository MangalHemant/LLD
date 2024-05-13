import Strategy.DriverStrategy;

public class Vehicle {

    DriverStrategy strategyobj;

    Vehicle(DriverStrategy obj) {
        this.strategyobj = obj;
    }

    void drive() {
        strategyobj.drive();
    }
}
