package com.company;

import java.util.Scanner;

public class RectangleArea
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of a rectangle");
        System.out.println("width?");
        int lenght = scan.nextInt();
        int width = scan.nextInt();
        int Area = width*lenght;
        System.out.print("Area = "+Area);
    }
}
