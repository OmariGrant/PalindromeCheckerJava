package org.example.palindrome;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckTest {

    @ParameterizedTest
    @ValueSource(strings = {"wow", "Don't nod", "Top Spot", "My gym!"})
    void isPalindrome(String string) {
        PalindomeCheckable palindromeCheck = new PalindromeCheck();
        assertTrue(palindromeCheck.isPalindrome(string));

    }

    @ParameterizedTest
    @ValueSource(strings = {"wow", "Don't nod", "Top Spot", "My gym!"})
    void isPalindromeEqual(String string) {
        PalindomeCheckable palindromeCheck = new PalindromeCheck();
        palindromeCheck.isPalindrome(string);
        assertEquals(palindromeCheck.getResult(), palindromeCheck.getCheckResultString());

    }

    @ParameterizedTest
    @ValueSource(strings = {"wow", "Don't nod", "Top Spot", "My gym!"})
    void isPalindromeArray(String string) {
        String[] strings = {"wow", "Don't nod", "Top Spot", "My gym!"};
        PalindomeCheckable palindromeCheck = new ArrayPalindromeCheck(strings);
        assertTrue(palindromeCheck.isPalindrome(string));

    }
    @Test
    @DisplayName("Given a string with ' return true from is Palindrome")
    void givenAStringwithApostrophy_returnTrue(){
        String string = "Don't nod";
        PalindromeCheck palindromeCheck = new PalindromeCheck();

        palindromeCheck.isPalindrome(string);
        System.out.println(palindromeCheck.getResult());
        assertEquals("DONTNOD", palindromeCheck.getResult());

    }

}