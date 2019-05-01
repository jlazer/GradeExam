//Justin Lazarski
//CIS 3090.04
//4/30/19
//Extra Credit Question

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //TODO:Write a main method that holds the correct answers, asks the user to enter a student's answers, call the above two methods, and then displays the results.
        // TODO:The program should use a constant for the maximum number of choice questions.

        Scanner input = new Scanner(System.in);

        System.out.println("Driver's license exam");
        System.out.println("20 Multiple Choice Questions");
        System.out.println("Mark A, B, C, D");
        System.out.println("Please enter your answers to the questions");

        String[] answersArray = new String[20];
        String answer;

        for(int i = 1; i < 21; i++) {
            System.out.println("Question " + i + ": ");
            
        }



    }

    public static int gradeExam(char[] correct, char[] student) {
        //TODO:This method will determine the number of incorrect answers. Be sure that the comparison is not case sensitive.
        int testInt = 0;
        return testInt;
    }
    public static int[] makeMissedArray(char[] correct, char[] student, int numIncorrect) {
        //TODO:This method will make the missed array and stores the numbers of all the questions that the student missed in it.
        int[] testIntArray = {0};
        return testIntArray;
    }

}
