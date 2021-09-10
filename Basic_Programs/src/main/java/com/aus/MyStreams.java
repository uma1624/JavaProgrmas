package com.aus;

// Java program to demonstrate
// Optional.filter() method

import java.util.*;
import java.util.stream.Stream;

public class MyStreams {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Charlie");
        names.add("Douglas");
        names.add("Sundaraman");
        names.add("Charlie");
        names.add("Yuki");

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("================== Using Streams ===================");
        Stream abc = names.stream();
        abc.forEach(System.out::println);
        System.out.println("================== Using same Streams 2nd time  ===================");
        abc.forEach(System.out::println);

    }
}
