package generics;

import examples.regex.calculator.StringCalculator;

import java.util.HashMap;
import java.util.Map;

public class GenericRunner {

    public static void main(String[] args) {

        SomeGeneric<Integer> genericClass = new SomeGeneric<>(11);

        System.out.println(genericClass.getValue());


        SomeGeneric<StringCalculator> geneticStringCalculator =
                new SomeGeneric<>(new StringCalculator());

        System.out.println(geneticStringCalculator
                .getValue()
                .evaluate("2/3"));

        Map<String,Integer> map = new HashMap<>();


        GenericMap<Double,String> genericMap = new GenericMap<>();
    }
}
