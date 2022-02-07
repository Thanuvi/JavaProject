package com.dxc.javaproject.exceptions;

public class ArrayIndexOutOfBound {
    public static void main(String args[])
    {
        try{
            int a[] = new int[4];
            a[5] = 9; // accessing 7th element in an array of
            // size 5
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }
    }
}
