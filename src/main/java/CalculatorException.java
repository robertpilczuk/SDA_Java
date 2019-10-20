public class CalculatorException {

    public static void main(String[] args) {
        double a = 1;
        double b = 0;

        Callculator callculator = new Callculator();
        try{
            callculator.div(a,b);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            System.out.println("Dzielisz przez 0 !!!");
        }catch (RuntimeException e){
            e.printStackTrace();
            System.out.println("Wat ar ju dułing!");
        }finally {
            System.out.println("Finally executed");
        }




    }

}
