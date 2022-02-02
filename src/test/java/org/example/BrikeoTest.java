package org.example;

import junit.framework.TestCase;

public class BrikeoTest extends TestCase {

    Brikeo br= new Brikeo();

    public void testLikesWord() {

        assertFalse(br.likesWord("cat"));
        assertFalse(br.likesWord("ablaze"));
        assertFalse(br.likesWord(" "));
    }
}