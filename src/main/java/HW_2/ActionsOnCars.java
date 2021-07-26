package HW_2;

import java.util.*;
import java.util.stream.Collectors;

public class ActionsOnCars {

    private Car car;
    private List<Car> listCars = new ArrayList<>();

    public Car addCar(Car car) {
        listCars.add(car);
        return car;
    }

    public void removeCar(Car car) { //remove by brand name
        listCars.removeIf(t -> t.brand == car.brand);
    }

    public void showCars() {
        if (!listCars.isEmpty()) {
            listCars
                    .stream()
                    .forEach(System.out::println);
        } else {
            System.out.print("list is empty!\n");
        }
    }

    public void sortCars() { //sort by brand name
        if (!listCars.isEmpty()) {
            listCars
                    .stream()
                    .sorted(Comparator.comparing(Car::getBrand))
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
        } else {
            System.out.print("list is empty!\n");
        }
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

    public void printCarActions(EnumCarMenu enumCarMenu, Car car) {

        switch (enumCarMenu.getNumOfOperation()) {
            case 1:
                addCar(car);
                System.out.println("\nCar was added.");
                break;
            case 2:
                removeCar(car);
                System.out.println("\nCar was removed (by name of brand).");
                break;
            case 3:
                System.out.println("\nList of all cars:");
                showCars();
                break;
            case 4:
                System.out.println("\nSorted list of cars by brand:");
                sortCars();
                break;
            default:
                System.out.println("\nWrong operation!");
                break;
        }
    }
}
