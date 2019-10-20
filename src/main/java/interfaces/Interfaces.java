package interfaces;

public class Interfaces {

    public static void main(String[] args) {
        AddInterface addTwoNumbers = new AddTwoNumbersWithStatic();
        System.out.println(addTwoNumbers.add(1,1));
    }
}
