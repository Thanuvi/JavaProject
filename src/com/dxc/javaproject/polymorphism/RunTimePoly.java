package com.dxc.javaproject.polymorphism;
class Test {


    public void method()
    {
        System.out.println("Run 1");
    }
}
public class RunTimePoly extends Test{
    public void method()
    {
        System.out.println("Run 2");
    }


    public static void main(String args[])
    {
        Test test = new RunTimePoly();

        test.method();
    }

}
