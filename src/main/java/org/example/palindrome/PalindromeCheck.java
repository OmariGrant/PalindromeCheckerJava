package org.example.palindrome;

import java.util.Objects;

public class PalindromeCheck implements PalindomeCheckable{
    private String string;
private String result;
private String checkResultString;
private boolean hasRunOnce = false;

//List of characters the program will ignore
private final String[] ignoreCharacters = new String[]{"!",",", ".", "@", "+", "-", "£", "$", "%", "&", "*", "(", ")", ":", ";", "[", "]", "'", "\"", "?"};

    public PalindromeCheck() {
    }
    public PalindromeCheck(String string) {
        setString(string);

    }

    public PalindromeCheck(String[] strings) {
        setString(string);

    }

  @Override
    public boolean checkSpaceAndSpecialCharacters(char checkingCharacter){
        //            check for special character and space
        boolean ignoreCharacter = false;
        for (String item:
                ignoreCharacters) {
            if (item.equals(String.valueOf(checkingCharacter)) || Character.isWhitespace(checkingCharacter)) {
                return true;

            }
        }
        return false;
    }

    @Override
    public void calculatePalindrome(String string){
        //temp variable for result
        String result = "";

//        loop the word
        for (int i = string.length()-1; i >= 0; i--) {
            char checkingCharacter = string.charAt(i);
//            check for special character and space
            boolean ignoreCharacter = checkSpaceAndSpecialCharacters(checkingCharacter);
            //            if its not a special character concat string
            if(!ignoreCharacter){
                result = result + String.valueOf(checkingCharacter).toUpperCase();
            }
        }

//        recursively run the function once to check the string again
        if (!isHasRunOnce()){
//        set results
            setResult(result);
            setHasRunOnce(true);
//            recursive function
            calculatePalindrome(getResult());
        } else {
//        set initial formatted word by printing the result backwards
            setCheckResultString(result);
        }

    }

    @Override
    public boolean isPalindrome(String string){

        calculatePalindrome(string);

//        use String equals function to check the values
        if (getResult().equals(getCheckResultString())){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
//        if (o == null || PalindromeCheck.class != o.getClass()) return false;
        PalindromeCheck palindromeCheck = (PalindromeCheck) o;
        if (!(o instanceof PalindromeCheck that)) return false;
        if (getResult() == null || palindromeCheck.getResult() == null) return (getString().equals(that.getString()) || getString() == that.getString());


            return (getString().equals(that.getString()) || getString() == that.getString())
                    &&
                    (getResult().equals(that.getResult()) || getString() == that.getResult());

    }

    @Override
    public String toString() {
        return string;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getString(), getResult());
    }

    @Override
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
@Override
    public String getCheckResultString() {
        return checkResultString;
    }

    public void setCheckResultString(String checkResultString) {
        this.checkResultString = checkResultString;
    }

    public boolean isHasRunOnce() {
        return hasRunOnce;
    }

    public void setHasRunOnce(boolean hasRunOnce) {
        this.hasRunOnce = hasRunOnce;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

}
