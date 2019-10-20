package task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    public void shouldTest() {
        Assertions.assertTrue(true);
    }

    @Test
    public void shouldVerifyPalindrome() {
        //given
        String palindrom = "oko";
        Palindrome palindrome = new Palindrome(palindrom);
        //when
        boolean result = palindrome.isPalindrome();
        //then
        Assertions.assertTrue(result);
    }


    @Test
    public void shouldNotVerifyPalindrome() {
        //given
        String palindrom = "oka";
        Palindrome palindrome = new Palindrome(palindrom);
        //when
        boolean result = palindrome.isPalindrome();
        //then
        Assertions.assertFalse(result);
    }


}
