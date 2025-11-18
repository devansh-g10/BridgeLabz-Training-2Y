package com.access.one;

public class Base {
    private void privateMethod() {
        System.out.println("Private method in Base");
    }

    void defaultMethod() {
        System.out.println("Default method in Base");
    }

    protected void protectedMethod() {
        System.out.println("Protected method in Base");
    }

    public void publicMethod() {
        System.out.println("Public method in Base");
    }

    public void accessInsideBase() {
        System.out.println("---- Inside Base Class ----");
        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }
}
