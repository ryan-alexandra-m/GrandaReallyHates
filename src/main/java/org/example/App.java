package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    static List<String> knownWords;

    public static void main(String[] args) {
        knownWords = new ArrayList<>();
        //This code below will populate the knownWords list with about 27,000 English words.
        try {
            BufferedReader br = new BufferedReader(new FileReader("common_words.txt"));
            String nextWord;
            while ((nextWord = br.readLine()) != null) {
                knownWords.add(nextWord);
            }
        } catch (Exception e) {
            e.printStackTrace();}

        Grandma grandma = new Orphan();

        System.out.println("My name is " + grandma.getName());
        System.out.println("Guess a word: ");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int guesses = 5;
        boolean right = grandma.likesWord(word);

        while (guesses > 1) {
            if (right && knownWords.contains(word)) {
                System.out.println("Grandma likes that word!");
                guesses = guesses - 1;
                System.out.println(guesses + " guesses left");
                word = scan.nextLine();
                right = grandma.likesWord(word);}
            if (!(knownWords.contains(word))) {
                System.out.println("Grandma doesn't know that word");
                guesses = guesses - 1;
                System.out.println(guesses + " guesses left");
                word = scan.nextLine();
                right = grandma.likesWord(word);}
            else {
                System.out.println("Grandma hates that word");
                guesses = guesses - 1;
                System.out.println(guesses + " guesses left");
                word = scan.nextLine();
                right = grandma.likesWord(word);}
        }

        guesses= guesses-1;
        if (guesses == 0) {
            if (right == true && knownWords.contains(word)) {
                System.out.println("Grandma likes that word! Great job, but you are out of guesses");}
            if (!(knownWords.contains(word))) {
                System.out.println("Grandma doesn't know that word, great job, but you are out of guesses");}
            if(right==false) {
                System.out.println("Grandma hates that word.  Great job, but you are out of guesses");}}
    }
}
