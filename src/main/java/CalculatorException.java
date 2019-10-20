import exceptions.SomthingIsNoYesException;

public class CalculatorException {

    public static void main(String[] args) {
        double a = 0;
        double b = 0;

        Callculator callculator = new Callculator();
        try{
            callculator.div(a,b);
        }catch (SomthingIsNoYesException e){
            System.out.println(e.getMessage() + " Staus code: " + e.getStatusCode() );
        }finally {
            System.out.println("Finally executed");
        }




    }

}
