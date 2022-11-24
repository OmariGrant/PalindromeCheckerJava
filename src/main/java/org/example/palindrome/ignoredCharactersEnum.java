package org.example.palindrome;

public enum ignoredCharactersEnum {
    fullStop("."),
    comma(","),
    exclamation("!"),
    and("&"),

    star("*"),
    at("@"),
    hyphen("-"),
    underscore("_"),

    quote("'"),
    backQuote("`"),
    apostrophy("\""),

    bracketL("("),
    bracketR(")"),

    //math characters
    pound("£"),
    dollar("$"),
    percent("%"),
    plus("+"),
    equals("=");

    ignoredCharactersEnum(String character) {
    }

    static boolean isSpecialCharacter(String character){
        for (ignoredCharactersEnum item: ignoredCharactersEnum.values()
             ) {

            if (character.equals(item)){
                return true;
            }
        }
        return false;
    }

}
