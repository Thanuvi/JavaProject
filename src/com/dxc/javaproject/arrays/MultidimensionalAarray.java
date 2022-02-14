package com.dxc.javaproject.arrays;

public class MultidimensionalAarray {
    public static void main(String args[]) {

        int arr[][] = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k< 3; k++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
