/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Deirdre Gruman-Walsh
 */
import java.util.Scanner;
public class PaintCalculator {
    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        Double length, width, area, quantity, NumGall; //declaration of variables

        //User input prompt for length and width
        System.out.print("Enter the length of the ceiling ");
        length = user_input.nextDouble();
        System.out.print("Enter the length of the ceiling ");
        width = user_input.nextDouble();

        //Calculating area to determine number of gallons need
        area = length * width;
        quantity = area/350;
        NumGall = Math.ceil(quantity);

        //Output to User
        System.out.println("You will need to purchase "+NumGall+" gallons of paint.");
    }
}
