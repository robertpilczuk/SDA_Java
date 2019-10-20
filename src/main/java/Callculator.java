import exceptions.SomthingIsNoYesException;

public class Callculator {


    public double div(double a,double b) throws SomthingIsNoYesException {
        if (a == 0 && b == 0){
            throw new SomthingIsNoYesException("Both values are zero !!",404);
        }
        if (b == 0){
            throw new SomthingIsNoYesException("You are dividing by zero!",403);
        }

        return a/b;
    }
}
