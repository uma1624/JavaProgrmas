package com.aus;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamMinFirstElements {
    public static void main(String[] args) {
        int[] numbers = {4,8,9,2,3,5,2};
       int min = IntStream.of(numbers).min().getAsInt();
       System.out.println(min);
       System.out.println(" == Print first 3 minimum elements == ");
       IntStream.of(numbers).distinct().sorted().limit(3).forEach(n ->System.out.print(n+" "));
        System.out.println(" =========== ");
       Arrays.stream(numbers).distinct().forEach(n->System.out.print(n+" "));
    }
}
