package org.example;

import junit.framework.TestCase;

public class BethTest extends TestCase {

    public void testBethLikesWord() {
        Beth b= new Beth();
        assertTrue(b.likesWord("booth"));
        assertFalse(b.likesWord("frog"));
        assertFalse(b.likesWord(""));
    }
}