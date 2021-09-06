/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example;
import java.util.Scanner;

public class App 
{
    // Function takes number of people, number of pizzas, number of slices per pizza and makes sure the number comes out even
    // Show how many pieces of pizza each person gets
    // If leftovers, show how many slices left over.
    public static void main( String[] args )
    {
        int numPeople, numPizzas, numSlices, totalSlices, sliceEach, leftover;

        System.out.println("How many people?");
        Scanner inputPeople = new Scanner(System.in);
        numPeople = inputPeople.nextInt();

        System.out.println("How many pizzas do you have?");
        Scanner inputPizzas = new Scanner(System.in);
        numPizzas = inputPizzas.nextInt();

        System.out.println("How many slices per pizza?");
        Scanner inputSlices = new Scanner(System.in);
        numSlices = inputSlices.nextInt();

        totalSlices = numPizzas * numSlices;

        System.out.println(numPeople + " people with " + numPizzas + " pizzas (" + totalSlices + " slices)");

        sliceEach = totalSlices / numPeople;

        System.out.println("Each person gets " + sliceEach + " pieces of pizza.");

        leftover = totalSlices % numPeople;

        System.out.println("There are " + leftover + " leftover pieces.");
    }
}
