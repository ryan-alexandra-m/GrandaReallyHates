package org.example;

import junit.framework.TestCase;

public class LaurelTest extends TestCase {

    public void testLikesWord() {
        Laurel l= new Laurel();
        assertTrue(l.likesWord("else"));
        assertFalse(l.likesWord("frog"));
        assertFalse(l.likesWord(""));
    }
}