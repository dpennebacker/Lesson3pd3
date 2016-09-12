package com.company;

public class Main {

    public static void main(String[] args) {
        String a1 = "Hello";
        String a2 = "It's me";
        System.out.print(a1 + " " + a2);
        //the above is known as concatenating
        //Another way to output the same?
        int times = 45;
        String a3 = a1 + " " + a2 + " " + times;
        System.out.println(a3);

        String name = "pennebacker";
        //we can tap into a method called length
        //returns the value of characters
        //only going to return an int
        int len = name.length();
        System.out.println(len);
        //next up...my favorite method of all
        //substring
        String word = "dog";
        word.substring(0);//dog
        word.substring(1);//og
        word.substring(0,1);//d
        word.substring(1,2);//o
        word.substring(2,3);//g
        //word.substring(3,4);//d

        String id = "123456";
        String last3
                = id.substring
                ((id.length()-3),(id.length()));
        System.out.println(last3);

    }
}
