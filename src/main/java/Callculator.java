public class Callculator {


    public double div(double a,double b) throws IllegalArgumentException,RuntimeException{
        if (a == 0 && b == 0){
            throw new RuntimeException();
        }
        if (b == 0){
            throw new IllegalArgumentException();
        }

        return a/b;
    }
}
