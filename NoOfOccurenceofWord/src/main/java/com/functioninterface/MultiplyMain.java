package com.functioninterface;
// Functional interface muliply a*b with lamda expression
public class MultiplyMain {
    public static void main(String[] args) {
        MyFun myFun = (a,b)->a*b;
        System.out.println(myFun.multiply(10,20));
    }
}
