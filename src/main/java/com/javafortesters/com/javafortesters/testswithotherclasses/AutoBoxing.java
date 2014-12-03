package com.javafortesters.com.javafortesters.testswithotherclasses;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AutoBoxing {

    @Test
    public void newSix() {
        Integer six = 6;
        assertEquals("autoboxing assignement for 6",
                6, six.intValue());
        System.out.println("six");

    }

}
