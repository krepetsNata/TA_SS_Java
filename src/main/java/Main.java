import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a=0,b=0, countOdd=0, countEven=0, size=0, biggestOdd=0, biggestEven=0;
        //Scanner scanner = new Scanner (System.in);

        System.out.println("Write two numbers a and b(a<=b)(interval): ");
        System.out.println("write a number: ");
        a = MyUtils.verifyIsNumber();//scanner, scanner.next());
        System.out.println("write b number: ");
        b = MyUtils.verifyIsNumber();//scanner, scanner.next());

        SimpleSequence simpleSequence = new SimpleSequence(a, b);
//        //list of simple sequence
        System.out.println("summ of odd numbers: " + simpleSequence.getCountOdd());
        System.out.println("summ of even numbers: " + simpleSequence.getCountEven());

//        List<Integer> listDig = new ArrayList<>();
//        if (a < b){
//            for(int i = a; i <=b; i++){
//                listDig.add(i);
//                if (i % 2 == 0) {
//                    countEven += i;
//                } else {
//                    countOdd += i;
//                }
//            }
//            System.out.println("summ of even numbers: " + countEven);
//            System.out.println("summ of odd numbers: " + countOdd);
//        } else{
//            System.out.println("a number should be <= than b number!");
//        }

//        // biggestOdd and biggestEven in simple sequence
//        int sizetemp = listDig.size();
//        if (listDig.get(sizetemp-1) % 2 == 0) {
//            biggestOdd = listDig.get(sizetemp-2);
//            biggestEven = listDig.get(sizetemp-1);
//        } else {
//            biggestOdd = listDig.get(sizetemp-1);
//            biggestEven = listDig.get(sizetemp-2);
//        }
//        System.out.print("list of sequence: ");
//        System.out.println(listDig);
//        System.out.println("biggestOdd=" + biggestOdd);
//        System.out.println("biggestEven=" + biggestEven);
//
//
//
//        //fibonacci sequence
//        System.out.println("write size of fibonacci sequence: ");
//        size = scanner.nextInt();
//        List<Integer> listF = fibonacci(size, biggestOdd, biggestEven);
//        System.out.println(listF);
//
//        //percentage odd and even numbers in fibonacci sequence
//        System.out.println(printPercentageOddEvenNumbersInFibonacci(listF));
    }



    static List<Integer> fibonacci(int n, int f1, int f2)
    {
        List<Integer> listFib = new ArrayList<>();

        if (n <= 1) {
            listFib.add(n);
        } else {
            listFib.add(f1);
            listFib.add(f2);
            for(int i = 2; i <= n; i++) {
                listFib.add(i, (listFib.get(i-1)+ listFib.get(i-2)));
            }
        }
        return listFib;
    }

    static String printPercentageOddEvenNumbersInFibonacci(List<Integer> listFib){
        String strPercentageOddEven = "";
        int countEven=0, countOdd=0;

        for(int i = 0; i < listFib.size(); i++) {
            if (listFib.get(i) % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        int percentageOdd = ((countOdd * 100)/listFib.size());
        int percentageEven = ((countEven * 100)/listFib.size());

        strPercentageOddEven = "percentage odd = " + percentageOdd + "%\npercentage even = " + percentageEven + "%";

        return strPercentageOddEven;
    }
}
