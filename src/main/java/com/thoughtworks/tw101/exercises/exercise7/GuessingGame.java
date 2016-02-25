package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

public class GuessingGame {
    private Scanner scanner;
    private int randomNumber = 1 + (int) (Math.random() * 99);
    private int guess = 0;


    public GuessingGame(){
        this.scanner = new Scanner(System.in);
    }

    public void start(){
        this.pickANumber();
        while (guess != randomNumber){
            guess = scanner.nextInt();
            if (guess > randomNumber){
                this.guessLower();
            }
            else if (guess < randomNumber){
                this.guessHigher();
            }
        }
        this.congratulate();
    }

    private void pickANumber(){
        System.out.println("Pick a number between 1 and 100! What do you think it is?");
    }

    private void guessHigher() {
        System.out.println("Guess higher");
    }

    private void guessLower() {
        System.out.println("Guess lower");
    }

    private void congratulate() {
        System.out.println("Congratulations! You guessed my number!");
    }
}
