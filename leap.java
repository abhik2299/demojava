package com.basicjava;
    import java.util.*;
    public class leap {
        public static void main(String args[])
        {
            Scanner sc =new Scanner(System.in);
            System.out.println("enter a year");
            int a =sc.nextInt();
            if(a>=1582)
            {
                if(a%100==0)
                {
                    if(a%400==0)
                        System.out.println("it is a leap year");
                    else
                        System.out.println("not a leap year");
                }
                else
                {
                    if(a%4==0)
                        System.out.println("it is a leap year");
                    else
                        System.out.println("not a leap year");
                }
            }
            else
                System.out.println("invalid year");
        }
}
