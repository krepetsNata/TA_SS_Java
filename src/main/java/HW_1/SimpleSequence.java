package HW_1;

import java.util.ArrayList;
import java.util.List;

public class SimpleSequence {
    private int a;
    private int b;
    private int countOdd;
    private int countEven;
    private int biggestOdd;
    private int biggestEven;
    private int sizeList;
    private List<Integer> listSimpleSequence;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getCountOdd() {
        for(int item : listSimpleSequence){
            if (item % 2 != 0) {
                countOdd += item;
            }
        }
        return countOdd;
    }

    public int getCountEven() {
        for(int item : listSimpleSequence){
            if (item % 2 == 0) {
                countEven += item;
            }
        }
        return countEven;
    }

    public List<Integer> getListSimpleSequence() {
        return listSimpleSequence;
    }

    public int getBiggestOdd() {
        getSizeList();
        if (listSimpleSequence.get(sizeList-1) % 2 == 0) {
            biggestOdd = listSimpleSequence.get(sizeList-2);
        } else {
            biggestOdd = listSimpleSequence.get(sizeList-1);
        }
        return biggestOdd;
    }

    public int getBiggestEven() {
        getSizeList();
        if (listSimpleSequence.get(sizeList-1) % 2 == 0) {
            biggestEven = listSimpleSequence.get(sizeList-1);
        } else {
            biggestEven = listSimpleSequence.get(sizeList-2);
        }
        return biggestEven;
    }

    public int getSizeList() {
        sizeList = listSimpleSequence.size();
        return sizeList;
    }

    public SimpleSequence(int a, int b) {
        this.a = a;
        this.b = b;
        listSimpleSequence = new ArrayList<>();

        if (a < b){
            for(int i = a; i <=b; i++){
                listSimpleSequence.add(i);
            }
        } else{
            System.out.println("A number should be <= than B number!\n");
            System.exit(0);
        }
    }
}
