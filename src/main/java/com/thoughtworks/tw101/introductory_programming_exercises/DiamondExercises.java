package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(3);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        for (int i = 1; i < (n + 4); i += 2){
            for (int k = 0; k < (4 - (i / 2)); k++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawUpperDiamond(n);
        drawLowerDiamond(n);
    }

    public static void drawUpperDiamond(int numOfRows){
        for (int i = 1; i < (numOfRows + 3); i += 2){
            drawOutContent(i);
        }
    }

    public static void drawOutContent(int num){
        for (int k = 0; k < (4 - (num / 2)); k++){
            System.out.print(" ");
        }
        for (int j = 0; j < num; j++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void drawLowerDiamond(int numOfRows){
        for (int i = (numOfRows + 1); i > 0; i -= 2){
            for (int k = 0; k < (5 - (i / 2)); k++){
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        for (int i = 1; i < (n + 1); i += 2){
            drawOutContent(i);
        }

        printMyName(n);
        drawLowerDiamond(n);
    }

    public static void printMyName(int spacing){
        for (int i = 0; i < ( 4 - (spacing/2)); i++){
            System.out.print(" ");
        }
        System.out.println("Ryan");
    }
}
