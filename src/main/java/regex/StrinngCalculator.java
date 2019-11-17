package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrinngCalculator {

    private Calculator calculator;

    public StrinngCalculator() {
        this.calculator = new Calculator();
    }

    public double evaluate(String equation){
            String[] values = getValues(equation);
            int val1 = Integer.parseInt(values[0]);
            int val2= Integer.valueOf(values[2]);
            double returnValue = 0;
            switch (values[1]){
                case "+":
                    returnValue = calculator.add(val1,val2);
                    break;
                case "-":
                    returnValue = calculator.sub(val1,val2);
                    break;
                case "*":
                    returnValue = calculator.mul(val1,val2);
                    break;
                case "/":
                    returnValue = calculator.div(val1,val2);
                    break;
            }
        return returnValue;
    }


    private String[] getValues(String equation){
        String[] returnValues = new String[3];
        Pattern pattern = Pattern.compile("(\\d+)([*/+-])(\\d+)");
        Matcher matcher = pattern.matcher(equation);
        if(matcher.find()){
            for (int i = 0; i < 3; i++) {
                returnValues[i] = matcher.group(i+1);
            }
        }
        return returnValues;
        //return new String[]{matcher.group(1), matcher.group(2), matcher.group(3)};
    }


}
