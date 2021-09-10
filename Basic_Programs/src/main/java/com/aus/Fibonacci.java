package com.aus;

public class Fibonacci {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int sum = 0;

        for (int k = 0; k < 10; k++) {
            System.out.print(" " + sum);
            i = j;
            j = sum;
            sum = i + j;
        }
    }
}
