package com.basicjava;

public class primitive {
    int k;
    double d;
    float f;
    boolean istrue;
    String p;

    public void printValue() {
        System.out.println("int default value = " + k);
        System.out.println("double default value = " + d);
        System.out.println("float default value = " + f);
        System.out.println("boolean default value = " + istrue);
        System.out.println("String default value = " + p);
    }

    public static void main(String[] args) {
        primitive test = new primitive();
        test.printValue();
    }
}
