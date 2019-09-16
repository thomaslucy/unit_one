package com.company;

public class TempConversion
{
    public static void main(String [] args)
    {
        double fahrenheit = 79;
        double celsius = (fahrenheit - 32)*5/9;
        System.out.println("Fahrenheit: "+fahrenheit+" degrees");
        System.out.print("Celsius: "+celsius+" degrees");
    }
}
