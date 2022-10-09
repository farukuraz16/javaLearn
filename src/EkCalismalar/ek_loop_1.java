package EkCalismalar;

import java.util.Scanner;

public class ek_loop_1 {
    public static void main(String[] args) {

//Take 10 integers from keyboard using loop and print their average value on the screen

        Scanner dat = new Scanner(System.in);

        int sum = 0;
        for(int i = 0; i<10;i++){
            System.out.println("Enter a number");
            int s = dat.nextInt();
            sum = sum+s;     }
        System.out.println("Sum is "+sum);
    }}
