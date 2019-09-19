package com.company;

import java.util.Scanner;

public class AddOneTakeOne
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int total = scan.nextInt();
        int real1=total;
        int add = real1++;
        int real2=total;
        int sub=real2--;
        System.out.println(real2+" "+total+ " "+real1);


    }
}
