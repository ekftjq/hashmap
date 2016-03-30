package com.company;

public class Main {

    public static void main(String[] args) {
        MyHash md = new MyHash();
        md.write("number1", "one");
        md.write("number2", "two");
        md.write("number4", "four");
        md.write("number5", "five");
        md.write("number3", "three");
        md.write("number7", "seven");

        System.out.println(md.getKeys().toString());
        //System.out.println(md.read("number3"));
        md.delete("number4");
        md.delete("number2");

        System.out.println(md.getKeys().toString());
        md.write("number10", "ten");
        System.out.println(md.getKeys().toString());

	// write your code here
    }

}
