package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessingGame {
    private Scanner scanner;
    private Viewer viewer;
    private ArrayList<Integer> guessList;

    private int randomNumber = 1 + (int) (Math.random() * 99);
    private int guess;


    public GuessingGame(){
        this.scanner = new Scanner(System.in);
        this.guessList = new ArrayList<>();
        this.viewer = new Viewer();
    }

    public void start(){
        viewer.pickANumber();
        this.play();
    }
    public void play(){
        try{
            while (guess != randomNumber){
                guess = Integer.parseInt(scanner.next());
                if (guess > randomNumber){
                    viewer.guessLower();
                }
                else if (guess < randomNumber){
                    viewer.guessHigher();
                }
                guessList.add(guess);
            }
            viewer.congratulate(randomNumber);
            viewer.showGuesses(guessList);
        }
        catch (NumberFormatException e){
            viewer.sayIncorrectGuess();
            this.play();
        }
    }
}
