package org.example.palindrome;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckTest {

    @ParameterizedTest
    @ValueSource(strings = {"level", "red rum, sir, is murder", "noon", "I did, did I?", "radar",
                "wow", "Don't nod", "Top Spot", "My gym!"})
    @DisplayName("Given a string, return true if the string is a palindrome - boolean")
    void GivenString_isPalindrome(String string) {
        PalindomeCheckable palindromeCheck = new StringPalindromeCheck();
        assertTrue(palindromeCheck.isPalindrome(string));

    }

    @ParameterizedTest
    @ValueSource(strings = {"level", "red rum, sir, is murder", "noon", "I did, did I?", "radar",
                "wow", "Don't nod", "Top Spot", "My gym!"})
    @DisplayName("Given a string, return true if the string is a palindrome - check string")
    void GivenAString_isPalindromeStringEqual(String string) {
        PalindomeCheckable palindromeCheck = new StringPalindromeCheck();
        palindromeCheck.isPalindrome(string);
        assertEquals(palindromeCheck.getResult(), palindromeCheck.getCheckResultString());

    }

    @ParameterizedTest
    @ValueSource(strings = {"level", "red rum, sir, is murder", "noon", "I did, did I?", "radar",
                "wow", "Don't nod", "Top Spot", "My gym!"})
    @DisplayName("Given a string of arrays, return true if the string is a palindrome - check boolean")
    void GivenStringArray_isPalindromeArray(String string) {
        String[] strings = {"level", "red rum, sir, is murder", "noon", "I did, did I?", "radar",
                "wow", "Don't nod", "Top Spot", "My gym!"};
        PalindomeCheckable palindromeCheck = new ArrayPalindromeCheck(strings);
        assertTrue(palindromeCheck.isPalindrome(string));

    }
    @Test
    @DisplayName("Given a string with ' return true from is Palindrome")
    void givenAStringwithApostrophy_returnTrue(){
        String string = "Don't nod";
        PalindromeCheck palindromeCheck = new StringPalindromeCheck();

        palindromeCheck.isPalindrome(string);
        System.out.println(palindromeCheck.getResult());
        assertEquals("DONTNOD", palindromeCheck.getResult());

    }



}