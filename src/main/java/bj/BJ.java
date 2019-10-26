package bj;

import java.util.Scanner;

public class BJ {

    public static void main(String[] args) {
        Dodawanie dodawanie = new Dodawanie();
        Odejmowanie odejmowanie = new Odejmowanie();
        Mnozenie mnozenie = new Mnozenie();
        Dzielenie dzielenie = new Dzielenie();
        double c, d, wynik2;
        int a, b, wynik;
        String wybór = "";
        Scanner scanner = new Scanner(System.in);
        while (!wybór.matches("quit")) {
            System.out.println("wybierz działanie: '+','-', '/', '*'");
            wybór = scanner.next();
            switch (wybór) {
                case "+":
                    System.out.println("podaj pierwszą liczbę: ");
                    a = scanner.nextInt();
                    System.out.println("podaj drugą liczbę: ");
                    b = scanner.nextInt();
                    wynik = dodawanie.dodawanie(a, b);
                    System.out.println("wynik: " + wynik);
                    break;
                case "-":
                    System.out.println("podaj pierwszą liczbę: ");
                    a = scanner.nextInt();
                    System.out.println("podaj drugą liczbę: ");
                    b = scanner.nextInt();
                    wynik = odejmowanie.odejmowanie(a, b);
                    System.out.println("wynik: " + wynik);
                    break;
                case "/":
                    System.out.println("podaj pierwszą liczbę: ");
                    c = scanner.nextDouble();
                    System.out.println("podaj drugą liczbę: ");
                    d = scanner.nextDouble();
                    wynik2 = dzielenie.Dzielenie(c, d);
                    System.out.println("wynik: " + wynik2);
                    break;
                case "*":
                    System.out.println("podaj pierwszą liczbę: ");
                    a = scanner.nextInt();
                    System.out.println("podaj drugą liczbę: ");
                    b = scanner.nextInt();
                    wynik = mnozenie.mnożenie(a, b);
                    System.out.println("wynik: " + wynik);
                    break;
            }

        }
    }
}

