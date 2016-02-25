package com.thoughtworks.tw101.exercises.exercise7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessingGame {
    private Scanner scanner;
    private Viewer viewer;
    private int randomNumber = 1 + (int) (Math.random() * 99);
    private int guess;


    public GuessingGame(){

        this.scanner = new Scanner(System.in);
        this.viewer = new Viewer();
    }

    public void start(){
        viewer.pickANumber();
        try{
            while (guess != randomNumber){
                guess = scanner.nextInt();
                if (guess > randomNumber){
                    viewer.guessLower();
                }
                else if (guess < randomNumber){
                    viewer.guessHigher();
                }
            }
            viewer.congratulate();
        }
        catch (InputMismatchException e){
            System.out.println("That's not a number! Try again");
        }

    }

}
