package examples.regex;

import examples.regex.calculator.StringCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRunner {
    public static void main(String[] args) {
      Pattern pattern =  Pattern.compile("(\\d+)([*\\/+-])(\\d+)");
      Matcher matcher = pattern.matcher("333/444");
      matcher.find();
        System.out.println(matcher.group());
        System.out.println(matcher.group(1));
        System.out.println(matcher.group(2));
        System.out.println(matcher.group(3));


        StringCalculator calculator = new StringCalculator();

        System.out.println(calculator.evaluate("10/2"));
        System.out.println(calculator.evaluate("10+2"));
        System.out.println(calculator.evaluate("10*2"));
        System.out.println(calculator.evaluate("10-2"));


    }


}
