package com.company;

public class Painting
{
    public static void main(String[] args)
    {
        int length = 32;
        int width = 40;
        int height = 16;
        int multi = (length*width) + (length*height*2) + (width*height*2) - (20*2) - (15*4);
        System.out.println (multi);

    }
}
