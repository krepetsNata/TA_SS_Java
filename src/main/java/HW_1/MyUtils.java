package HW_1;

import java.util.Scanner;

public class MyUtils {
    public static int verifyIsNumber() {
        int num = 0;
        Scanner scan = new Scanner(System.in);

        if (scan.hasNextInt()) {
            num = scan.nextInt();
        } else {
            System.out.println("Wrong number format! Try again! \nInput only integers: ");
            num = verifyIsNumber();
        }
        return num;
    }
}
