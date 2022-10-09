package j12_Loops.L01_ForLoop;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {
        //41 kere maşallah

        for(int i=1;i<42;i++){
            System.out.println(i+" kere maşallah");
        }

//iki basamaklı tek sayıları yan yana return

        for (int i =11; i<100 ;i+=2){
            System.out.print(i+", ");
        }

        System.out.println("\n ****** ");

        Scanner dat = new Scanner(System.in);
        System.out.println("bir tek sayı seçiniz..= ");
        int x= dat.nextInt();

        System.out.println("üst limit seçiniz..= ");
        int y = dat.nextInt();


        for ( int i = x ; i < y ; i += 2) {
            if (i>0 && i%2==1){
            System.out.print(i + ", ");}
        }

    }
}
