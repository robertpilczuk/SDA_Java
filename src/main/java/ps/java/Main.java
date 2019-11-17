package ps.java;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {

    private static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    private static Garage myGarage = new Garage();

    public static void main(String[] args) {

        System.out.println("type garage name: ");
        String gName = scanner.nextLine();
        myGarage.setName(gName);

        System.out.println("type capacity: ");
        int capacity = 0; //do wyjasnienia=======================================================================
        try {
            capacity = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("type correct capacity");
            scanner.nextInt();
        }
        if(capacity < 1) {
            throw new IllegalArgumentException(String.format("za mala liczba", capacity));
        }
        myGarage.setCapacity(capacity);

        System.out.println("new garage created. name: " + myGarage.getName() + ", capacity: " + myGarage.getCapacity());

        boolean quit = false;
        while(!quit) {
            printActions();

            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("quitting...");
                    quit = true;
                    break;
                case 1:
                    addCarToTheGarage();
                    break;
                case 2:
                    printCarList();
                    break;
                case 3:
                    removeCar();
                    break;
                case 4:
                    printActions();
                    break;
            }
        }
    }


    private static boolean addCarToTheGarage() {

        if(myGarage.getCars().size() < myGarage.getCapacity()) {

            System.out.println("Adding new car. model:");
//            scanner.nextLine(); //========================do wyjasnienia, czemu bez tej komendy wczytuje pusty string===========
            String model = scanner.nextLine();

            System.out.println("color:");
            String color = scanner.nextLine();

            System.out.println("model year:");
            int modelYear = scanner.nextInt();

            System.out.println("engine size: ");
            double engineSize = scanner.nextDouble();

            myGarage.addCar(model, engineSize, modelYear, color);
            return true;
        } else {
            System.out.println("no more empty slots");
            return false;
        }
    }

    private static void printCarList() {
        myGarage.printCars();
    }

    private static void removeCar() {
        System.out.println("select slot to remove: ");
        printCarList();
        int slot = scanner.nextInt();
        myGarage.removeCar(slot);
    }

    private static void printActions() {
        System.out.println("Choose action:");
        System.out.println("0 - to quit\n" +
            "1 - to add car to the garage\n" +
            "2 - to print car list\n" +
            "3 - to remove car\n" +
            "4 - to print available actions");
    }
}
