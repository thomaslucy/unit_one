package com.company;

import java.util.Scanner;

public class TempConversion
{
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter degrees fahrenheit");
        System.out.println("Enter degrees celsius");
        double fahrenheit = scan.nextDouble();
        double celsius = (fahrenheit - 32)*5/9;
        System.out.println("Fahrenheit: "+fahrenheit+"°");
        System.out.print("Celsius: "+celsius+"°");
    }
}
