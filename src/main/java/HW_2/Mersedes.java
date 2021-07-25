package HW_2;

public class Mersedes extends Car {

    public Mersedes() {
    }

    public Mersedes(String brand, String model, int speed) {
        super(brand, model, speed);
        this.speed = speed;
    }

    @Override
    void setBrand(String brand) {
        super.brand = "Mercedes";
    }

    @Override
    public String toString() {
        return "\nMersedes{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                "}";
    }
}
