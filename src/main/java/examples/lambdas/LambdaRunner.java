package examples.lambdas;

public class LambdaRunner {


    public static void main(String[] args) {

        Calc calcImpl = new Calc() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };

        Calc calc = (a, b) -> a+b;

        System.out.println(calc.add(3,4));

        // () -> a+b

        // e -> e+1
        // (q,w,e,r,t,y) -> q+w+e+r+t+y
        // (a,b) -> {
        //  a++;
        //  b++;
        // return a+b--;
        // }

    }
}
