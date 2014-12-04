package com.javafortesters.com.javafortesters.com.javafortesters.basicsofjavarevisited;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by sakib on 12/4/14.
 */
public class BooleanType{

    @Test
    public void BooleanType(){
        boolean truthy = true;
        boolean falsey = false;

        assertTrue(truthy);
        assertFalse(falsey);

        truthy = Boolean.TRUE;
        falsey = Boolean.FALSE;

        assertTrue(truthy);
        assertFalse(falsey);

    }


}
