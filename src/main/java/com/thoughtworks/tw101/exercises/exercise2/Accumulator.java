package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    int total = 0;

    public void increment(){
        total += 1;
    }

    public void total(){
        System.out.println(total);
    }
}
