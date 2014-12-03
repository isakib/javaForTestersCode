package com.javafortesters.com.javafortesters.domainentities;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class User {

// a construction without argument
//
//    @Test
//    public void userHasDefaultUsernameAndPassword() {
//        User user = new User();
//        assertEquals("default username expected",
//                "username",
//                user.getUsername());
//
//        assertEquals("default password expected",
//                "password",
//                user.getPassword());
//    }
//
//    private String username;
//    private String password;
//
//    public User() {
//        username = "sakib";
//        password = "123456";
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//

// from here: hide one part to pass.


// a constructor with arguments

    private final String password;
    private final String username;

    public User(String username, String password)

    {
        this.username = username;
        this.password = password;
    }

    @Test
    public void canConstructWithUsernameAndPassword() {
        User user = new User("admin", "123456");
        assertEquals("given username expected",
                "admin",
                user.getUsername());

        assertEquals("given password expected",
                "123456",
                user.getPassword());

    }

    private String getUsername() {
        return "admin";
    }

    private String getPassword(){
        return "123456";
    }
}


