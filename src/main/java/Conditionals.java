public class Conditionals {

    private static boolean isRain = true;

    public static void main(String[] args) {

        if (isRain) {
            System.out.println("Biorę parasolkę");
        }

        if (3 > 5) {
            System.out.println("to się nie wykona");
        }


        if (3 < 5) {
            System.out.println("to się wykona");
        }

        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println(a + " jest większe od " + b);
        } else if (a == b) {
            System.out.println("Obie liczby są równe " + a);
        } else {
            System.out.println(a + " jest mniejsze od " + b);
        }

        int number = 0;
        if (number == 0) {
            System.out.println("Why zero?");
        } else if (number == 1) {
            System.out.println("Ha Ha one.");
        } else if (number == 2) {
            System.out.println("Hey I have two");
        } else if (number == 3) {
            System.out.println("OMG three");
        } else {
            System.out.println("Done");
        }

        WhatIf whatIf = new WhatIf();

        System.out.println(whatIf.getName());


    }


}
