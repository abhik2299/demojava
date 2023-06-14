package com.basicjava;

public class staticvar
    {
        static int a = 10;
        static int b;

        static {
            System.out.println("Static block ");
            b = a * 4;
        }

        public static void main(String[] args)
        {
            System.out.println("from main");
            System.out.println("Value of a : "+a);
            System.out.println("Value of b : "+b);
        }
    }

