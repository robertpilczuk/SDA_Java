package interfaces;

public class Interfaces {

    public static void main(String[] args) {
        AddInterface addTwoNumbers = new AddTwoNumbersWithStatic();
        System.out.println(addTwoNumbers.add(1,1));

        AddInterface anonymousClass = new AddInterface() {
            @Override
            public int add(int a, int b) {
                return a+b+1;
            }
        };

        AddInterface anonymousClass2 = new AddInterface() {
            @Override
            public int add(int a, int b) {
                return 10+a;
            }
        };

    }
}
