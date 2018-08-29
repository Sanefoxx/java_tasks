package ru.sanefox;

import com.google.common.base.Joiner;

public class Main {

    public static void main(String... args) {
        String s = Joiner.on(",").join(5, 25);
        System.out.println("What's up, dude?!");
        System.out.println(s);
    }

}
