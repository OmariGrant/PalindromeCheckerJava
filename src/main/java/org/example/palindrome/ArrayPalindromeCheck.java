package org.example.palindrome;

import java.util.ArrayList;

public class ArrayPalindromeCheck extends PalindromeCheck {

    private ArrayList<String> resultArray = new ArrayList<>();
    public ArrayPalindromeCheck(String[] strings) {
        super(strings);
        for (int i = 0; i < strings.length-1; i++) {
            if (this.resultArray != null) {
                this.resultArray.add(strings[i]);
            }
        }
    }


//    getterrs and setters

    public ArrayList<String> getResultArray() {
        return resultArray;
    }

    public void setResultArray(ArrayList<String> resultArray) {
        this.resultArray = resultArray;
    }

    @Override
    public void calculatePalindrome(String string) {
        for (int i = 0; i <= this.resultArray.toArray().length-1; i++) {
            super.calculatePalindrome(string);
        }
    }


}
