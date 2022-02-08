package com.dxc.javaproject.strings;
import java.io.*;
import java.util.*;
public class StringConstructMethod {
    public static void main(String[] args) {
        String s = "duckduckgo";



        System.out.println("String length = " + s.length());


        System.out.println("Character at 3rd position = "
                + s.charAt(3));


        System.out.println("Substring " + s.substring(3));


        System.out.println("Substring  = " + s.substring(2, 5));


        String s1 = "duck";
        String s2 = "duckgo";
        System.out.println("Concatenated string  = " +
                s1.concat(s2));


        String s4 = "Search Share Learn";
        System.out.println("Index of Share " +
                s4.indexOf("Share"));


        System.out.println("Index of c  = " +
                s4.indexOf('c', 3));


        Boolean out = "duck".equals("duck");
        System.out.println("Checking Equality  " + out);
        out = "duck".equals("duck");
        System.out.println("Checking Equality  " + out);

        out = "duck".equalsIgnoreCase("dUck ");
        System.out.println("Checking Equality " + out);


        int out1 = s1.compareTo(s2);
        System.out.println("the difference between ASCII value is=" + out1);

        String word1 = "duckygo";
        System.out.println("Changing to lower Case " +
                word1.toLowerCase());


        String word2 = "Duckygo";
        System.out.println("Changing to UPPER Case " +
                word2.toUpperCase());


        String word4 = " Learn Share Learn ";
        System.out.println("Trim the word " + word4.trim());


        String str1 = "buckbuckgo";
        System.out.println("Original String " + str1);
        String str2 = "buckbuckgo".replace('b', 'd');
        System.out.println("Replaced b with d-> " + str2);
    }
}