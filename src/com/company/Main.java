package com.company;

public class Main {

    public static void main(String[] args) {
        MyHash md = new MyHash();
        md.write("a", "ab");
        md.write("b", "cd");
        for (String s : md.getKeys()) {
            System.out.println(s + ",");
        }
	// write your code here
    }

}
