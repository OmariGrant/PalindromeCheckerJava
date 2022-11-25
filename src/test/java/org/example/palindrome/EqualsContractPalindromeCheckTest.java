package org.example.palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualsContractPalindromeCheckTest {

    String[] string1 = {"red rum, sir, is murder", "noon", "I did, did I?"};
    String string21 = "red rum, sir, is murder";
    String string22 = "noon";
    String string23 = "I did, did I?";

    ArrayPalindromeCheck arrayPalindromeCheck = new ArrayPalindromeCheck(string1);
    PalindomeCheckable arrayPalindromeCheck1 = new ArrayPalindromeCheck(string1);
    PalindomeCheckable arrayPalindromeCheck11 = new PalindromeCheck(string1);

    StringPalindromeCheck PalindromeCheck = new StringPalindromeCheck(string21);
    StringPalindromeCheck PalindromeCheck1 = new StringPalindromeCheck(string22);
    StringPalindromeCheck PalindromeCheck2 = new StringPalindromeCheck(string23);
    PalindomeCheckable PalindromeCheck0 = new StringPalindromeCheck(string21);
    PalindomeCheckable PalindromeCheck11 = new StringPalindromeCheck(string22);
    PalindomeCheckable PalindromeCheck22 = new StringPalindromeCheck(string23);

    PalindomeCheckable PalindromeCheck00 = new PalindromeCheck(string21);
    PalindomeCheckable PalindromeCheck111 = new PalindromeCheck(string22);
    PalindomeCheckable PalindromeCheck222 = new PalindromeCheck(string23);
    @Test
    void testEqualsArray() {
                assertTrue(arrayPalindromeCheck1.equals(arrayPalindromeCheck));
                assertTrue(arrayPalindromeCheck1.equals(arrayPalindromeCheck11));
                assertTrue(arrayPalindromeCheck.equals(arrayPalindromeCheck11));
    }

    @Test
    void testEquals() {

        // x equal y
        assertTrue(PalindromeCheck.equals(PalindromeCheck0));
        assertTrue(PalindromeCheck1.equals(PalindromeCheck11));
        assertTrue(PalindromeCheck2.equals(PalindromeCheck22));


        // y equal z
        assertTrue(PalindromeCheck0.equals(PalindromeCheck00));
        assertTrue(PalindromeCheck11.equals(PalindromeCheck111));
        assertTrue(PalindromeCheck22.equals(PalindromeCheck222));


        // x equal z
        assertTrue(PalindromeCheck.equals(PalindromeCheck00));
        assertTrue(PalindromeCheck1.equals(PalindromeCheck111));
        assertTrue(PalindromeCheck2.equals(PalindromeCheck222));
    }

    @Test
    void testHashCode() {
        assertEquals(PalindromeCheck.hashCode(), PalindromeCheck0.hashCode());
        assertEquals(PalindromeCheck0.hashCode(), PalindromeCheck00.hashCode());
        assertEquals(PalindromeCheck.hashCode(), PalindromeCheck00.hashCode());


    }
}