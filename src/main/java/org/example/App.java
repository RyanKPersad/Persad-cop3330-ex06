/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Persad
 */
package org.example;
import java.time.*;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // getting the current year each
        // using the now() method
        Year y = Year.now();
        Scanner myObj = new Scanner(System.in);
        System.out.print( "What is your current age? " );
        //Input
        String age  =  myObj.nextLine();
        System.out.print( "At what age would you like to retire? " );
        //Input
        String ret_age  =  myObj.nextLine();
        //Convert to int
        int newAge = Integer.parseInt(age);
        int new_y = Integer.parseInt(String.valueOf(y));
        int newRet_Age = Integer.parseInt(ret_age);
        int yearsLeft = newRet_Age - newAge;
        int retYear = new_y + yearsLeft;
        //Output
        String print1 = String.format("You have %d years left until you can retire.",yearsLeft);
        String print2 = String.format("It's %d, so you can retire in %d.",new_y,retYear);
        System.out.print(print1+"\n"+print2);


    }
}
