package task2;

public class CountLastChar2 {

    private char[] text;

    public CountLastChar2(String input) {
        text = input.toCharArray();
    }


    public int countLastChar() {
        int counter = 0;
        char last = text[text.length - 1];
        for (int i = 0; i < text.length; i++) {
            if (text[i] == last) {
                counter++;
            }
        }

        int[] ints = {3,4,4,545,63,2432,4};

        for (int mySingleInteger: ints){
            System.out.println(mySingleInteger);
        }

        int counter_2 = 0;
        for (char c : text) {
            if (c == last) {
                counter++;
            }
        }
        return counter_2; // or return counter;
    }
}


