package HW_2;

import HW_1.MyUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int opt = 0, speed = 0;
        String brandWord = "", modelWord = "";
        Car car = null;
        ActionsOnCars actions = new ActionsOnCars();

        while (opt != 5) {
            System.out.println("--------------------------------------------------------------------");
            System.out.println(Arrays.toString(EnumCarMenu.values()));
            System.out.println("\nInput num of operation, which you want execute (from 1 to 4) or 5 for exit: ");
            opt = MyUtils.verifyIsNumber();

            if (opt == 1 || opt == 2) {

                boolean flagIsValidBrand = true;

                while (flagIsValidBrand) {

                    System.out.println("What brand do you want to work - BMW or Mercedes, please input brand word: ");
                    brandWord = ActionsOnCars.inputWord();

                    flagIsValidBrand = false;

                    switch (brandWord) {
                        case "Mercedes":
                        case "mercedes":
                            car = new Mersedes();
                            break;
                        case "BMW":
                        case "bmw":
                            car = new BMW();
                            break;
                        default:
                            flagIsValidBrand = true;
                            System.out.println("\nWrong brand! Try again!");
                    }
                }
                System.out.println("Input model(string) and speed(integer): ");
                modelWord = ActionsOnCars.inputWord();
                speed = MyUtils.verifyIsNumber();

                car.setBrand();
                car.setModel(modelWord);
                car.setSpeed(speed);

                actions.printCarActions(EnumCarMenu.setNumOfOperation(opt), car);
            } else if (opt == 3 || opt == 4) {
                actions.printCarActions(EnumCarMenu.setNumOfOperation(opt), car);
            } else {
                System.out.println("Wrong number of operation! Try again.");
            }
        }
        System.out.println("Program is closed!");
    }
}
