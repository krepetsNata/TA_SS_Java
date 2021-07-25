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
            System.out.println("Input num of operation, which you want execute (from 1 to 4) or 5 for exit: ");
            opt = MyUtils.verifyIsNumber();

            if (opt == 1 || opt == 2) {
                System.out.println("What brand do you want to work - BMW or Mercedes, please input brand word: ");
                brandWord = ActionsOnCars.inputWord();

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
                        System.out.println("Wrong brand! Try again! \nInput name of brand: ");
                }
                System.out.println("Input model and speed: ");
                modelWord = ActionsOnCars.inputWord();
                speed = MyUtils.verifyIsNumber();

                car.setBrand(brandWord);
                car.setModel(modelWord);
                car.setSpeed(speed);


                //-----add test data
//                    actions.addCar(car);
//                    actions.addCar(car);
//                    actions.addCar(car);
                //------
                EnumCarMenu.printCarActions(actions, opt, car);
            } else if (opt == 3 || opt == 4) {
                EnumCarMenu.printCarActions(actions, opt, car);
            } else {
                System.out.println("Wrong nomber of operation");
            }
        }
        System.out.println("program is closed!");
    }
}
