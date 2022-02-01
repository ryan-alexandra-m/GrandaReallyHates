package org.example;

import junit.framework.TestCase;

public class ZoeyTest extends TestCase {

    public void testZoeyLikesWord(){
        Zoey z= new Zoey();
        assertTrue(z.likesWord("zoo"));
        assertFalse(z.likesWord("frog"));
        assertFalse(z.likesWord(""));

    }


}