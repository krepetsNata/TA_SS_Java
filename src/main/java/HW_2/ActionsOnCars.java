package HW_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ActionsOnCars {

    Car car;
    List<Car> listCars = new ArrayList<>();

    public Car addCar(Car car) {
        listCars.add(car);
        return car;
    }

    public void removeCar(Car car) {
        listCars.removeIf(t -> t.brand == car.brand);
    }

    public void showCars() {
        listCars
                .stream()
                .forEach(System.out::println);
    }

    public void sortCars() {
        listCars
                .stream()
                .sorted(Comparator.comparing(Car::getBrand))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static String inputWord() {
        String str = "";
        Scanner scan = new Scanner(System.in);
        if (scan.hasNext()) {
            str = scan.next();
        } else {
            System.out.println("Wrong word! Try again: ");
            str = inputWord();
        }
        return str;
    }
}
