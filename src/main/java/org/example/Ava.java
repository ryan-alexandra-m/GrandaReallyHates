package org.example;

public class Ava extends Grandma {
    public Ava() {
        super("Ava");
    }

    @Override
    public boolean likesWord(String str) {
        int count= 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)== 'a'){
                count= count+1;
            }else{
                count=count;
            }

        }if(count>=2){
            return true;
        }
        return false;



    }
}