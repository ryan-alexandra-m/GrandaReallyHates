package org.example;

import junit.framework.TestCase;

public class GrannyTest extends TestCase {

    public void testBettyLikesWord(){
        Granny b= new Granny();
        assertTrue(b.likesWord("tree"));
        assertTrue(b.likesWord("boot"));
        assertFalse(b.likesWord("fog"));
        assertFalse(b.likesWord(""));
        assertTrue(b.likesWord("see"));
    }


}