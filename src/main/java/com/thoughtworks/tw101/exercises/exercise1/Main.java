package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i <= 100; i +=2){
            System.out.println(i);
            counter += i;
        }
        System.out.println(counter);
    }
}
