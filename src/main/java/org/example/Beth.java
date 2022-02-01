package org.example;

public class Beth extends Grandma {
    public Beth() {
        super("Beth");
    }

    @Override
    public boolean likesWord(String str) {
        if (str.lastIndexOf("t") < str.length()-1) {
            for (int i = 0; i < str.length();i++ ) {
                if (str.charAt(str.indexOf("t") + 1) == 'h') {
                    return true;

                }
                if ((str.charAt(str.lastIndexOf("t") + 1) == 'h')) {
                    return true;
                }


            }



        }return false;
    }
}
