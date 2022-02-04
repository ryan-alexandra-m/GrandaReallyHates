//package org.example;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.List;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.ArrayList;
//
//
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class OrphanTest {
//
//
//    Orphan br= new Orphan();
//
//    @Test
//    public void testLikesWord() {
//
//        assertFalse(br.likesWord("cat"));
//        assertFalse(br.likesWord("ablaze"));
//        assertFalse(br.likesWord(" "));
//        assertTrue(br.likesWord("lander"));
//        assertTrue(br.likesWord("phobia"));
//
//    }
////
////    @Test
////    public void findOutIfBrikeoLikesAnything(){
////        Orphan b= new Orphan();
////        //
////        List<String> wordsBrikeoLikes = new ArrayList<>();
////        // add all the words brikeo likes to the list
////        Assert.assertEquals(wordsBrikeoLikes.size(), 0);
////
////        try {
////            BufferedReader br = new BufferedReader(new FileReader("common_words.txt"));
////            String nextWord;
////            while ((nextWord = br.readLine()) != null) {
////                if(b.likesWord(nextWord)){
////                    wordsBrikeoLikes.add(nextWord);
////                    System.out.println(wordsBrikeoLikes);
////                }
////            }
////            if(wordsBrikeoLikes.isEmpty()){
////                System.out.println("no");
////            }
////        } catch (Exception e) {
////            e.printStackTrace();}
//
//
//
//
//
//    }
//}