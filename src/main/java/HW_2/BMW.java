package HW_2;

public class BMW extends Car {

    public BMW() {
    }

    public BMW(String brand, String model, int speed) {
        super(brand, model, speed);
        this.speed = speed;
    }

    @Override
    void setBrand(String brand) {
        super.brand = "BMW";
    }

    @Override
    public String toString() {
        return "BMW{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}
