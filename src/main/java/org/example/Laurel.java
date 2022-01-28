package org.example;

public class Laurel extends Grandma {
    String name;


    public Laurel() {
        super("Laurel");
    }

    @Override
    public boolean likesWord(String str) {
        return endsWithVowel(str);

    }

    public static boolean endsWithVowel(String str){
        if(str.charAt(0)== str.charAt(str.length()-1)){
            return true;
        }if(str.length()<2){
            return false;
        }
        return false;
    }


}
