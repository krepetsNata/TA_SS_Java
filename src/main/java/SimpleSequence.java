import java.util.ArrayList;
import java.util.List;

public class SimpleSequence {
    int a;
    int b;
    int countOdd;
    int countEven;
    List<Integer> listSimpleSequence;

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
        return countOdd;
    }

    public void setCountOdd(int countOdd) {
        this.countOdd = countOdd;
    }

    public int getCountEven() {
        return countEven;
    }

    public void setCountEven(int countEven) {
        this.countEven = countEven;
    }

    public List<Integer> getListSimpleSequence() {
        return listSimpleSequence;
    }

    public void setListSimpleSequence(List<Integer> listSimpleSequence) {
        this.listSimpleSequence = listSimpleSequence;
    }

    public SimpleSequence(int a, int b) {
        if (a < b){
            this.a = a;
            this.b = b;
            for(int i = a; i <=b; i++){
                listSimpleSequence.add(i);
            }
        } else{
            System.out.println("a number should be <= than b number!");
        }
    }

    public void method(){
        //list of simple sequence
        //List<Integer> listDig = new ArrayList<>();
        if (a < b){
            for(int i = a; i <=b; i++){
                listSimpleSequence.add(i);
                if (i % 2 == 0) {
                    countEven += i;
                } else {
                    countOdd += i;
                }
            }

        } else{
            System.out.println("a number should be <= than b number!");
        }
    }
}
