package com.basicjava;
import java.util.*;
public class stringcheck {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter two Strings");
        String a= sc.nextLine();
        String b= sc.nextLine();
        if(a.equals(b))
            System.out.println("strings are equal");
        else
            System.out.println("strings are not equal");
    }
}
