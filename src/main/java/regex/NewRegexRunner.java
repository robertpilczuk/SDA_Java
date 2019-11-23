package regex;

import java.util.Observable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewRegexRunner {
    public static void main(String[] args) {

        String zipCode = "20-001";
        zipCode.matches("^([\\d]{2})(-)([\\d]{3})$");

        Pattern pattern = Pattern.compile("^([\\d]{2})(-)([\\d]{3})$");
        Matcher matcher = pattern.matcher(zipCode);
        if(matcher.find()) {
            String group0 = matcher.group(0);
            String group1 = matcher.group(1);
            String group2 = matcher.group(2);
            String group3 = matcher.group(3);
            String group4 = null;
            try {
                group4 = matcher.group(4);

            } catch (IndexOutOfBoundsException ignore) {
            }
            System.out.println(group0);
            System.out.println(group1);
            System.out.println(group2);
            System.out.println(group3);
            System.out.println(group4);
        }else{
            System.out.println("Sorry Vinetou nic nie znalazłem");
        }
        

    }
}
