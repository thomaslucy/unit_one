package com.company;
/*Lucy Thomas
2/24/2019
Finding the correct change for any number of cents
 */
import java.util.Scanner;

public class CorrectChange
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a whole number of cents");
        int numofcents = scan.nextInt();
        int numofdollars = numofcents/100;
        int remainder1 = numofcents%100;
        int numofquarters = remainder1/25;
        int remainder2 = remainder1%25;
        int numofdimes = remainder2/10;
        int remainder3 = remainder2%10;
        int numofnickels = remainder3/5;
        int remainder4 = remainder3%25;
        int numofpennies = remainder4;
        System.out.println("You have "+numofdollars+" dollars, "+numofquarters+" quarters, "+numofdimes+" dimes, "+numofnickels+" nickels, "+numofpennies+" pennies.");
    }

}
