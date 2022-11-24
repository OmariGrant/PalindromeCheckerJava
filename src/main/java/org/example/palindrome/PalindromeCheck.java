package org.example.palindrome;

public class PalindromeCheck {

String result;
String checkResultString;

boolean hasRunOnce = false;

    String[] ignoreCharacters = new String[]{"!",",", ".", "@", "+", "-", "£", "$", "%", "&", "*", "(", ")", ":", ";", "[", "]", "'", "\""};

    private boolean checkSpaceAndSpecialCharacters(char checkingCharacter){
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

    private void calculatePalindrome(String string){
        String result = "";

//        loop the word
        for (int i = string.length()-1; i >= 0; i--) {
            char checkingCharacter = string.charAt(i);
            System.out.print(checkingCharacter+" ");
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
            System.out.println(result);
            setResult(result);
            setHasRunOnce(true);
//            recursive function
            calculatePalindrome(getResult());
        } else {
//        set initial formatted word by printing the result backwards
            System.out.println(result);
            setCheckResultString(result);
        }

    }
    public boolean isPalindrome(String string){

        calculatePalindrome(string);

//        convert to uppercase for check
        if (getResult().toUpperCase().equals(getCheckResultString().toUpperCase())){

//        if (string.toUpperCase().equals(result.toUpperCase())){
            return true;
        } else {
            return false;
        }

    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

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
}
