package com.company;

import java.util.Scanner;

public class FindTheAverage
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double total = 0;
        System.out.println("Enter four values");
        double value1 = scan.nextDouble();
        total+=value1;
        double value2 = scan.nextDouble();
        total+=value2;
        double value3 = scan.nextDouble();
        total+=value3;
        double value4 = scan.nextDouble();
        total+=value4;
        double average = total/4;
        System.out.println("Average = "+total);






    }
}
