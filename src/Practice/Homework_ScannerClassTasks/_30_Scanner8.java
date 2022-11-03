package Practice.Homework_ScannerClassTasks;

import java.util.Scanner;

public class _30_Scanner8 {
    public static void main(String[] args) {

    /*    Bir byte oluşturunuz.
          Konsola kg cinsinden bir ağırlık yazınız.
          Byte'ı yazdırınız.   */

//Byte a= 5;
//System.out.println(a+"kg");

        Scanner input= new Scanner(System.in);
        System.out.print("Kg cinsinden bir ağırlık giriniz?:");
        Byte b= input.nextByte();
        System.out.println("Ağırlık : " + b + "kg");
    }
}
