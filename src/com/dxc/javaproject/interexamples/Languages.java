package com.dxc.javaproject.interexamples;

interface Language
{
    void getName(String name);
}

// class implements interface changes1
class ProgrammingLanguage implements Language {

    // implementation of abstract method
    public void getName(String name) {
        System.out.println("Programming Language: " + name);
    }
}


class Languages {
    public static void main(String[] args) {
        ProgrammingLanguage language = new ProgrammingLanguage();
        language.getName("Java");
    }
}