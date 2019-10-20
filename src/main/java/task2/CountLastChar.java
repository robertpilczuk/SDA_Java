package task2;

public class CountLastChar {

    private String text;

    public CountLastChar(String input){
        text = input;
    }


    public int countLastChar(){
        char last = text.charAt(text.length()-1);
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)==last){
                counter++;
            }
        }
        return counter;
    }


}
