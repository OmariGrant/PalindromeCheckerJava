package org.example.palindrome;

public interface PalindomeCheckable {

    boolean checkSpaceAndSpecialCharacters(char checkingCharacter);
    void calculatePalindrome(String string);
    boolean isPalindrome(String string);

    String getResult();
    String getCheckResultString();

}
