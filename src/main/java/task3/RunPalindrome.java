package task3;

public class RunPalindrome {

    public static void main(String[] args) {
        String text = "oko";
        Palindrome palindrome = new Palindrome(text);
        boolean result = palindrome.isPalindrome();
        System.out.println("Is \""+ text+"\" is palidrome: "  + result);
    }

}
