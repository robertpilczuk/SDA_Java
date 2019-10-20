package interfaces;

public class AddTwoNumbersWithStatic implements AddInterface {
    private static int counter = 0;

    public int add(int a , int b ){
        counter++;
        return a+b+counter;
    }

}
