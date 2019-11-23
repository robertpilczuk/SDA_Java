package recursion;

public class Recursion {

    // int value = 6;

    public int factorial(int value){
        if(value > 0){
            return value * factorial(value-1);
        }
        return 1;
    }


}
