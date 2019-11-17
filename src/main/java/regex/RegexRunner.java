package regex;

import examples.regex.calculator.StringCalculator;

public class RegexRunner {

    public static void main(String[] args) {
        System.out.println(new StrinngCalculator()
                .evaluate("10/2"));

        StringCalculator calculator = new StringCalculator();

        System.out.println(calculator.evaluate("10*2"));
        System.out.println(calculator.evaluate("10-2"));
        System.out.println(calculator.evaluate("10+2"));

    }

}
