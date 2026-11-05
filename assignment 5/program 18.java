interface Electric {
    void chargeBattery();
}

class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class ElectricCarHybrid extends Car implements Electric {
    public void chargeBattery() {
        System.out.println("Battery is charging");
    }

    public static void main(String[] args) {
        ElectricCarHybrid e = new ElectricCarHybrid();

        e.start();
        e.drive();
        e.chargeBattery();
    }
}