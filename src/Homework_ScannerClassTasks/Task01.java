package Homework_ScannerClassTasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"
		 */

        Scanner input= new Scanner(System.in);
        System.out.println("mid-term grade?:");
        byte mid=input.nextByte();
        System.out.println("final grade?:");
        byte fin=input.nextByte();
        System.out.println("project grade?:");
        byte pro=input.nextByte();
        System.out.println("Your Grade: " + ((mid*0.30)+(fin*0.20)+(pro*0.50)));

    }
}
