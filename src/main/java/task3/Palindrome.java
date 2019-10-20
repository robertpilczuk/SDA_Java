package task3;

public class Palindrome {

    private char[] text;
    private char[] reversed;

    public Palindrome(String text) {
        this.text = text.toCharArray();
    }

    public boolean isPalindrome() {
        boolean isPalindrome = true;

        reversed = reverse(text);

        for (int i = 0; i < text.length; i++) {
            if (text[i] != reversed[i]) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }

    private char[] reverse(char[] toReverse) {
        char[] reversed = new char[text.length];
        for (int i = 0; i < text.length; i++) {
            reversed[i] = text[text.length - 1 - i];
        }
        return reversed;
    }

}
