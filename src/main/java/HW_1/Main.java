package HW_1;

public class Main {
    public static void main(String[] args) {
        int a=0, b=0, n=0;

        //task 1 - user enters interval
        System.out.println("Write two numbers a and b(a<=b)(interval):");
        System.out.println("Input A number: ");
        a = MyUtils.verifyIsNumber();
        System.out.println("Input B number: ");
        b = MyUtils.verifyIsNumber();

        //task 2 - print sum of odd and even numbers
        SimpleSequence simpleSequence = new SimpleSequence(a, b);
        System.out.println("\nSum of odd numbers: " + simpleSequence.getCountOdd());
        System.out.println("Sum of even numbers: " + simpleSequence.getCountEven());

        //task 3.1 - biggest odd and even numbers (for f1 and f2 Fibonacci sequence)
        System.out.print("\nList of simple sequence: ");
        System.out.println(simpleSequence.getListSimpleSequence());
        System.out.println("biggestOdd=" + simpleSequence.getBiggestOdd()); //f1
        System.out.println("biggestEven=" + simpleSequence.getBiggestEven()); //f2

        //task 3.2 - Fibonacci sequence
        System.out.println("\nwrite size of fibonacci sequence: ");
        n = MyUtils.verifyIsNumber();
        FibonacciSequence fibonacciSequence = new FibonacciSequence(simpleSequence.getBiggestOdd(), simpleSequence.getBiggestEven(), n);
        System.out.print("List of Fibonacci sequence: ");
        System.out.println(fibonacciSequence.getListFibonacciSequence());


        //task 4 - percentage odd and even numbers in Fibonacci sequence
        System.out.println(fibonacciSequence.printPercentageOddEvenNumbersInFibonacci());
    }
}
