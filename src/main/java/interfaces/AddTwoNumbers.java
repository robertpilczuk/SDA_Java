package interfaces;

public class AddTwoNumbers implements AddInterface,Second{

    public int add(int a , int b ){
        return a+b;
    }

    @Override
    public void method() {

    }
}
