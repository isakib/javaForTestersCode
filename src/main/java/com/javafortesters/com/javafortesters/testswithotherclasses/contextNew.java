package com.javafortesters.com.javafortesters.testswithotherclasses;

import com.javafortesters.domainobject.interim.TestAppEnv;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class contextNew {


    @Test
    public void checkTitleCorrectOnApp() {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get(TestAppEnv.getUrl());

        assertEquals("Title should match",
                "Hotel management software built for humans", driver.getTitle());

    }

}
