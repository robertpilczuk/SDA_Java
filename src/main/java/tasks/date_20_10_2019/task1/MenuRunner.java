package tasks.date_20_10_2019.task1;

import java.util.Scanner;

public class MenuRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Menu menu = setupMenu();

        Menu currentMenu = menu;
        do{
            currentMenu.print();
            System.out.print("Podaj swój wybór: ");
            int selection = scanner.nextInt();
            currentMenu.setOptionSelected(selection);
            currentMenu = currentMenu.getNextMenu();
        } while (currentMenu!=null);

        menu.showPath();
    }

    private static Menu setupMenu(){

        Menu[] temp = {new Menu("1. Kelvin;2. Celsius;3. Farenheit;4. Rankin")};

        Menu[] secondLevel = {new Menu(temp,"1. Temperatura"),new Menu("1. Add;2. Sub;3. Div;4. Mul")};

        Menu menu = new Menu(secondLevel,"1. Konwertwery;2. Kalkulator");

        return menu;
    }

}