package com.company;

import java.util.Scanner;

public class RoundNegatives
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a negative decimal number:");
        double negdec = scan.nextDouble();
        double round = (int)(negdec-0.5);
        System.out.print(negdec+"Rounded to a whole number is"+round);

    }
}
