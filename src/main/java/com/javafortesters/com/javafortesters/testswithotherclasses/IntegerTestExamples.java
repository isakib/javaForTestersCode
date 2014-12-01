package com.javafortesters.com.javafortesters.testswithotherclasses;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntegerTestExamples {

    @Test
    public void integerExploration() {
        Integer four = new Integer(4);
        assertEquals("intValue returns int 4",
               4, four.intValue());

//        Integer four = new Integer(4); - missing , as failed to print 6

        Integer six = 6;
        assertEquals("autoboxing assignment for 6",
            6, six.intValue());
        System.out.println(six);

    }
}
