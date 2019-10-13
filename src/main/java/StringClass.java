public class StringClass {

    public static void main(String[] args) {

        char[] charText = {'L','o','r','e','m'};

        String nullText = null; // brak obiektu
        String emptyText = ""; // empty text - pusty tekt;
        String nonEmptyText = " "; // text nie jest pusty bdyż zawiera znak spacji
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."; //
        String secondText = new String(charText);


        System.out.println(nullText);
        System.out.println(emptyText);
        System.out.println(nonEmptyText);
        System.out.println(text);
        System.out.println(secondText);


    }

}
