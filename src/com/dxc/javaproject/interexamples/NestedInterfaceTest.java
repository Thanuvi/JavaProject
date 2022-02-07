package com.dxc.javaproject.interexamples;
class Animal {
    interface Activity {
        void move();
    }
}
class Dog implements Animal.Activity {
    public void move() {
        System.out.println("Dogs can walk and run");
    }
}
public class NestedInterfaceTest {
    public static void main(String args[]) {
        Dog dog = new Dog();
        dog.move();
    }
}
