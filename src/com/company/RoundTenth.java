package com.company;

import java.util.Scanner;

public class RoundTenth
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Decimal number?");
        double num = scan.nextDouble();
        double mult = num*10;
        int round = (int)(mult+0.5);
        double rounded = round/10.0;
        System.out.println(num+" rounded to the nearest tenth is "+rounded);

    }

}
