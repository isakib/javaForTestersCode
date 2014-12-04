package com.javafortesters.com.javafortesters.com.javafortesters.basicsofjavarevisited;

/**
 * Created by sakib on 12/4/14.
 */
public class ClassExample {

    ClassExample instance = new ClassExample("Sakib");

    public static final String CONSTANT = "a constant string";
    public static String aClassField = "a class field";
    protected static String proField = "a class field";
    public String pubField = "a public field";
    public String privField = "a private field";
    private String name;


    public ClassExample(String name) {
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
