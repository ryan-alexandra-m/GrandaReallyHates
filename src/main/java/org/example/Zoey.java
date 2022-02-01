package org.example;

public class Zoey extends Grandma {
    public Zoey( ) {
        super("Zoey");
    }

    @Override
    public boolean likesWord(String str) {
        if(str.contains("x")|| str.contains("y") || str.contains("z") || str.contains("q")){
            return true;
        }return false;
    }
}
