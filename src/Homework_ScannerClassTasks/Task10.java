package Homework_ScannerClassTasks;
import java.util.Scanner;
public class Task10 {
// Write a Java program to convert temperature from Fahrenheit to Celsius degree.

// formula

    // c = (f-32)*5/9
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Temperature? (F): ");
        float f= input.nextFloat();
        System.out.print("Temprature (C) = " + ((f-32)*5/9));
    }




}
