package org.example;

public class Granny extends Grandma {
    public Granny() {
        super("Betty");
    }

    @Override
    public boolean likesWord(String str) {
        return hasDoubleLetters(str);
    }

    public static boolean hasDoubleLetters(String str){
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return true;
            }

        }
        return false;

    }
}


