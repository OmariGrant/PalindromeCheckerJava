package org.example.palindrome;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayPalindromeCheck extends PalindromeCheck {

    private ArrayList<String> resultArray = new ArrayList<>();
    public ArrayPalindromeCheck(String[] strings) {
        super(strings);

//        Add all strings to array list
        for (int i = 0; i < strings.length-1; i++) {
            if (this.resultArray != null) {
                this.resultArray.add(strings[i]);
            }
        }
    }

    private void generateResults(ArrayList<Integer> notPalidrome ){
        for (int i = 0; i < notPalidrome.size()-1; i++) {
            this.resultArray.remove(i);
        }
    }
    @Override
    public void calculatePalindrome(String string) {
//        loop through array list of string
        ArrayList<Integer> notPalidrome = new ArrayList<Integer>();
        for (int i = 0; i <= this.resultArray.toArray().length-1; i++) {
            super.calculatePalindrome(string);
            if (!super.isPalindrome(this.resultArray.toArray()[i].toString())){
                notPalidrome.remove(i);
            }
        }
        generateResults(notPalidrome);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArrayPalindromeCheck that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getResultArray(), that.getResultArray());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getResultArray());
    }

    //    getterrs and setters

    public ArrayList<String> getResultArray() {
        return resultArray;
    }

    public void setResultArray(ArrayList<String> resultArray) {
        this.resultArray = resultArray;
    }




}
