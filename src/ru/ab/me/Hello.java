package ru.ab.me;

public class Hello {
    public static void main(String[] args) {
        System.out.println( sayHello("Hello", "Dolly"));
    }
    public static String sayHello (String greeting, String name){
        return greeting + ", " + name + "!";
    }
}