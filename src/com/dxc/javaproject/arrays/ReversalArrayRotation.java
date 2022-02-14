package com.dxc.javaproject.arrays;

public class ReversalArrayRotation {
    public static void main (String[]args) {

        int[] arrayLeft = new int[]{ 1, 2, 3, 4, 5 };

        int[] arrayRight = new int[]{ 1, 2, 3, 4, 5 };



        int r = 2;

        arrayLeft = rotateLeft (arrayLeft, r);

        arrayRight = rotateRight (arrayRight, r);

        System.out.println ("Array after left rotation : ");

        for (int i = 0; i < arrayLeft.length; i++) {

            System.out.print (" " + arrayLeft[i]);

        }

        System.out.println ();

        System.out.println ("Array after right rotation : ");

        for (int i = 0; i < arrayRight.length; i++) {

            System.out.print (" " + arrayRight[i]);

        }

    }



    public static void reverse (int[]arr, int start, int end) {

        while (start < end) {

            int temp = arr[start];

            arr[start] = arr[end];

            arr[end] = temp;

            start++;

            end--;

        }

    }



    public static int[] rotateLeft (int arr[], int r) {

        r %= arr.length;



        reverse (arr, 0, r - 1);



        reverse (arr, r, arr.length - 1);



        reverse (arr, 0, arr.length - 1);

        return arr;

    }

    public static int[] rotateRight (int arr[], int r) {

        r %= arr.length;



        reverse (arr, 0, arr.length - 1);



        reverse (arr, 0, r - 1);



        reverse (arr, r, arr.length - 1);

        return arr;

    }
}
