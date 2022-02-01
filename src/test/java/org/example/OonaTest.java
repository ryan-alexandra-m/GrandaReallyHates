package org.example;

import junit.framework.TestCase;

public class OonaTest extends TestCase {

    public void testOonaLikesWord() {
        Oona o= new Oona();
        assertTrue(o.likesWord("book"));
        assertFalse(o.likesWord("frog"));
        assertFalse(o.likesWord(""));


        }

    }
