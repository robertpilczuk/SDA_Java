package tasks.date_20_10_2019.task2;

import java.awt.*;

public class ArgumentsAnalizer {

    private String[] arguments;
    private ParsedArguments parsedArguments;

    public ArgumentsAnalizer(String[] arguments, ParsedArguments parsedArguments) {
        this.arguments = arguments;
        this.parsedArguments = parsedArguments;
    }

    public ParsedArguments splitArguments(){
        for (int i = 0; i < arguments.length; i++) {
            if (arguments[i].startsWith("-")){
                argumentAnalizer2(i,arguments);
//                String argument = arguments[i];
//                String value = arguments[i+1];
//                argumentAnalizer(argument,value);
            }
        }
        return parsedArguments;
    }


    private void argumentAnalizer2(int index,String[] table){
        String argument = table[index];
        switch (argument){
            case "-i":
                this.parsedArguments.setNumber(Integer.valueOf(table[index+1]));
                break;
            case "-ip":
                this.parsedArguments.setIpAddres(table[index+1]);
                break;
            case "-l":
                this.parsedArguments.setLongNumber(Long.valueOf(table[index+1]));
                break;
            case "-c":
                this.parsedArguments.setSomeChar(table[index+1].charAt(0));
                break;
            case "-p":
                Point point = new Point(Integer.valueOf(table[index+1]),Integer.valueOf(table[index+2]));
                this.parsedArguments.setPoint(point);
        }
    }

    private void argumentAnalizer(String argument,String value){
        switch (argument){
            case "-i":
                this.parsedArguments.setNumber(Integer.valueOf(value));
                break;
            case "-ip":
                this.parsedArguments.setIpAddres(value);
                break;
            case "-l":
                this.parsedArguments.setLongNumber(Long.valueOf(value));
                break;
            case "-c":
                this.parsedArguments.setSomeChar(value.charAt(0));
                break;

        }

    }

}
