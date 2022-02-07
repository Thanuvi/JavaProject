package com.dxc.javaproject.decision;
import java.util.Scanner;
public class JavaReturnStatementExample {
    int value;

    int readValue() {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter any number: ");
        return this.value=read.nextInt();
    }

    void showValue(int value) {
        for(int i = 0; i <= value; i++) {
            if(i == 5)
                return;
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        JavaReturnStatementExample obj = new JavaReturnStatementExample();

        obj.showValue(obj.readValue());

    }
}
