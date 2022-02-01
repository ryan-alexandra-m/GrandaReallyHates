package org.example;

public class Oona extends Grandma {
    public Oona( ) {
        super("Oona");
    }

    @Override
    public boolean likesWord(String str) {
        if (str.lastIndexOf("o") < str.length()-1) {
            for (int i = 0; i < str.length(); i++ ) {
                if (str.charAt(str.indexOf("o") + 1) == 'o') {
                    return true;

                }
                if ((str.charAt(str.lastIndexOf("o") + 1) == 'o')) {
                    return true;
                }


            }



        }return false;
    }
}
