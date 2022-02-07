package com.dxc.javaproject.exceptions;

import com.dxc.javaproject.inter.Sayable;

import java.util.Scanner;

public class ArrayIndexOutOfBound implements Sayable {
    public static void main(String args[])
    {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("enter index value to store");
            int i=sc.nextInt();

            int a[] = new int[4];
            a[i] = 9; // accessing 7th element in an array of
            // size 5

            ArrayIndexOutOfBound arrayIndexOutOfBound=new ArrayIndexOutOfBound();
            arrayIndexOutOfBound.say("hi i am there");
            System.out.println("value stored is "+a[i]+" at the index " +i);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");

        }
    }

    @Override
    public void say(String msg) {
        System.out.println(msg);
    }
}
