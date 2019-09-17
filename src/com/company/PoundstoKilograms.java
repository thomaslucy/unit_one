package com.company;

import java.util.Scanner;

public class PoundstoKilograms
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of pounds");
        System.out.println("Enter the number of kilograms");
        final double CONVERSION = 2.205;
        double lbs = scan.nextInt();
        double kilos = lbs/CONVERSION;
        System.out.print(lbs+" pounds=");
        System.out.print(kilos+"kilograms");
    }
}
