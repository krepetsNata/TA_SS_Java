package HW_2;

public abstract class Car extends ActionsOnCars implements Alarm, Vehicle {

    String brand;
    String model;
    int speed;

    public Car() {
        System.out.println("Empty car was created! Please, configure it.");
    }

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    abstract void setBrand(String brand);

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int speedUp() {
        return speed++;
    }

    public int slowDown() {
        return speed--;
    }

    public String turnAlarmOn(String brand) {
        brand = this.brand;
        return turnAlarmOn(brand);
    }

    public String turnAlarmOff(String brand) {
        brand = this.brand;
        return turnAlarmOff(brand);
    }
}
