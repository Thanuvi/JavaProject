package com.dxc.javaproject.decision;
import java.util.Scanner;

public class JavaLabelledStatement {
    public static void main(String args[]) {

        Scanner read = new Scanner(System.in);

        reading: for (int i = 1; i <= 3; i++) {
            System.out.print("Enter a even number: ");
            int value = read.nextInt();

            verify: if (value % 2 == 0) {
                System.out.println("\nYou won!!!");
                System.out.println("Your score is " + i*10 + " out of 30.");
                break reading;
            } else {
                System.out.println("\nSorry try again!!!");
                System.out.println("You let with " + (3-i) + " more options...");
                continue reading;
            }
        }
    }
}
