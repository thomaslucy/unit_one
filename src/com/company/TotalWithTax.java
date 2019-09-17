package com.company;

import java.util.Scanner;

public class TotalWithTax
{
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the price of the item");

        final double TAXRATE = 0.0825;
        double price = scan.nextInt();
        double tax = price*TAXRATE;
        double total = price + tax;
        System.out.println("Price: $"+price);
        System.out.println("Sales Tax: $"+tax);
        System.out.print("Total: $"+total);

    }
}
