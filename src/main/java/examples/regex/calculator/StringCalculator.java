package examples.regex.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    private Calculator calculator;

    public StringCalculator() {
        this.calculator = new Calculator();
    }

    public StringCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public double evaluate(String equation) {
        String[] values = findValues(equation);
        double val1 = Double.parseDouble(values[0]);
        double val2 = Double.parseDouble(values[2]);
        double result = 0.0;
        switch (values[1]) {
            case "+":
                result = calculator.add(val1, val2);
                break;
            case "-":
                result = calculator.sub(val1, val2);
                break;
            case "*":
                result = calculator.mul(val1, val2);
                break;
            case "/":
                result = calculator.div(val1, val2);
                break;
        }
        return result;
    }

    private String[] findValues(String equation) {
        String[] groups = null;
        Pattern pattern = Pattern.compile("(\\d+)([*\\/+-])(\\d+)");
        Matcher matcher = pattern.matcher(equation);
        if (matcher.find()) {
            groups = new String[matcher.groupCount()];
            for (int i = 0; i < 3; i++) {
                groups[i] = matcher.group(i + 1);
            }
        }
        return groups;
    }


}
