package org.example;

import junit.framework.TestCase;

public class BettyTest extends TestCase {

    public void testBettyLikesWord(){
        Betty b= new Betty();
        assertTrue(b.likesWord("tree"));
        assertTrue(b.likesWord("boot"));
        assertFalse(b.likesWord("fog"));
        assertFalse(b.likesWord(""));
        assertTrue(b.likesWord("see"));
    }


}