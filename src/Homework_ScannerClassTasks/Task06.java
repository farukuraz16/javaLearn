package Homework_ScannerClassTasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

        Scanner input = new Scanner(System.in);
        System.out.print("dik üçgenin bir kenar dik kenar uzunluğunu yazınız: ");
        int dk1= input.nextInt();
        System.out.print("dik üçgenin diğer dik kenar uzunluğunu yazınız: ");
        int dk2= input.nextInt();
        System.out.println("Hipotenüs= "+Math.sqrt((Math.pow(dk1, 2)+Math.pow(dk2, 2))));






    }
}
