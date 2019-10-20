import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        int intInput;

        while (!input.matches("quit")) {
            input= scanner.nextLine();
//            intInput = Integer.valueOf(input);
            //            Integer;
//            Double;
//            Long;
//            Float;
//            Short;
//            Byte;
//            Character;
//            Boolean;
//            int inputValue= Integer.valueOf(input);
//            int fromStringToInt = Integer.valueOf("734234")+232131;


            System.out.println(input);
//            System.out.println(intInput);
//            System.out.println(inputValue);
//            System.out.println(fromStringToInt);
        }
    }

}
