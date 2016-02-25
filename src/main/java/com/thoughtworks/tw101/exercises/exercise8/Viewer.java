package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;

public class Viewer {

    public void pickANumber(){
        System.out.println("Pick a number between 1 and 100! What do you think it is?");
    }

    public void guessHigher() {
        System.out.println("Guess higher");
    }

    public void guessLower() {
        System.out.println("Guess lower");
    }

    public void congratulate(int number) {
        System.out.println("Congratulations! Here's the path you took to get to my number: " + number);
    }

    public void showGuesses(ArrayList<Integer> guessList){
        System.out.print(guessList.get(0));
        for (int i = 1; i < guessList.size(); i++){
            System.out.print(", " + guessList.get(i));
        }
    }

    public void sayIncorrectGuess() {
        System.out.println("That's not a number! Try again");
    }
}
