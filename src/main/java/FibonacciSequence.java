import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {
    private int f1;
    private int f2;
    private int n;
    private int countOdd;
    private int countEven;
    private int percentageOdd;
    private int percentageEven;
    private int sizeList;
    private List<Integer> listFibonacciSequence;

    public int getF1() {
        return f1;
    }

    public void setF1(int f1) {
        this.f1 = f1;
    }

    public int getF2() {
        return f2;
    }

    public void setF2(int f2) {
        this.f2 = f2;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getCountOdd() {
        for(int item : listFibonacciSequence){
            if (item % 2 != 0) {
                countOdd++;
            }
        }
        return countOdd;
    }

    public int getCountEven() {
        for(int item : listFibonacciSequence){
            if (item % 2 == 0) {
                countEven++;
            }
        }
        return countEven;
    }

    public int getPercentageOdd() {
        getCountOdd();
        getSizeList();
        percentageOdd = (countOdd * 100)/sizeList;
        return percentageOdd;
    }

    public int getPercentageEven() {
        getCountEven();
        getSizeList();
        percentageEven = (countEven * 100)/sizeList;
        return percentageEven;
    }

    public int getSizeList() {
        sizeList = listFibonacciSequence.size();
        return sizeList;
    }

    public List<Integer> getListFibonacciSequence() {
        return listFibonacciSequence;
    }

    public FibonacciSequence(int f1, int f2, int n) {
        this.f1 = f1;
        this.f2 = f2;
        this.n = n;
        listFibonacciSequence = new ArrayList<>();

        if (n <= 1) {
            listFibonacciSequence.add(n);
        } else {
            listFibonacciSequence.add(f1);
            listFibonacciSequence.add(f2);
            for(int i = 2; i <= n; i++) {
                listFibonacciSequence.add(i, (listFibonacciSequence.get(i-1)+ listFibonacciSequence.get(i-2)));
            }
        }
    }

    public String printPercentageOddEvenNumbersInFibonacci(){
        getPercentageOdd();
        getPercentageEven();
        String strPercentageOddEven = "\npercentage odd = " + percentageOdd + "%\npercentage even = " + percentageEven + "%";
        return strPercentageOddEven;
    }
}
