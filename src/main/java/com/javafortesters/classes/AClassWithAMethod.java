package com.javafortesters.classes;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AClassWithAMethod {

    public void aMethodOnAClass(){
        System.out.println("Hello World");
    }

    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2+2;
        assertEquals("2+2", 4, answer);
        System.out.println("answer");
    }
}
