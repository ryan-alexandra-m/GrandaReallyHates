package org.example;

import junit.framework.TestCase;

import java.util.zip.Adler32;

public class AvaTest extends TestCase {

    public void testLikesWord() {
        Ava a= new Ava();
        assertTrue(a.likesWord("aa"));
        assertFalse(a.likesWord("frog"));
        assertFalse(a.likesWord(""));

    }
}