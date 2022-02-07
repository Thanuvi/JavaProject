package com.dxc.javaproject.polymorphism;
class Animal3 {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }
}

class Dog3 extends Animal3 {
    @Override
    public void displayInfo() {
        System.out.println("I am a dog.");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Dog3 d1 = new Dog3();
        d1.displayInfo();
    }
}
