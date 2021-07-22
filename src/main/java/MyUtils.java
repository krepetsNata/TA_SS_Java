import java.util.Scanner;

public class MyUtils {
    public static int verifyIsNumber(){//Scanner scan, String strNum){
//        int number=0;
//        Scanner scan = new Scanner (System.in);
//        System.out.println("Input number: ");
//
//        while (!scan.hasNextInt())
//        {
//            System.out.printf("Input only integers! Try again.");
//            //System.out.printf("\n%s > ", strNum);
//            scan.next();
//        }
//
//        number = scan.nextInt();
//        scan.close();
//
//        return number;

            int num = 0;

            System.out.println("Input number: ");

            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()){
                num = scan.nextInt();
            } else{
                System.out.println("Wrong number format! Input only integer digits!");
                num = verifyIsNumber();
            }
            return num;

    }

}
