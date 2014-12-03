package com.javafortesters.com.javafortesters.testwithourownclasses.domainobject;

import com.javafortesters.domainobject.interim.TestAppEnv;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestAppEnvironmentTest {
    @Test
    public void canGetUrlStatically(){
        assertEquals("Returns hard coded URL",
                "Hotel management software built for humans",
                TestAppEnv.getUrl());
    }
}
