package org.example;

import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrphanTest3 extends TestCase {

    public void testLikesWord() {

        Orphan oo= new Orphan();

        assertFalse(oo.likesWord("cat"));
        assertFalse(oo.likesWord("ablaze"));
        assertFalse(oo.likesWord(" "));
        assertTrue(oo.likesWord("lander"));
        assertTrue(oo.likesWord("phobia"));
        assertTrue(oo.likesWord("wheels"));
        assertTrue(oo.likesWord("orphan"));
    }
}