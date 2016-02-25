package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static void main(String[] args) {
        generate(30);
    }

    public static List<Integer> generate(int number){
        List<Integer> primeFactors = new ArrayList<>();
        int divisor = 2;
        while (number > 1){
            if (number % divisor == 0){
                primeFactors.add(divisor);
                number = number / divisor;
            }
            else{
                divisor++;
            }
        }
        printOutPrimeFactors(primeFactors);
        return primeFactors;
    }

    public static void printOutPrimeFactors(List<Integer> primeFactorsArrayList){
        if (primeFactorsArrayList.size() >= 1){
            System.out.print(primeFactorsArrayList.get(0));
            for (int i = 1; i < primeFactorsArrayList.size(); i++){
                System.out.print("," + primeFactorsArrayList.get(i));
            }
        }
    }

}
