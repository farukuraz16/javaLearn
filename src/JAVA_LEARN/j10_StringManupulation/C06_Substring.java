package JAVA_LEARN.j10_StringManupulation;

import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {


         /*
        substring()
        Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
        substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
        substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
        indexi'e kadar parçayı return eder
        baslangic indexi ==> inclusive/dahil
        bitis indexi ==> eclusive/haric
         */
        String str = "java bilenin sırtı yere gelmez : )";
        System.out.println(str.substring(10));

        //str datasının so n 10 harfini yazdırınız.

        System.out.println(str.substring(str.length()-10));


        //str datasının ilk 10 harfini yazdırınız.

        System.out.println(str.substring(0,10));//O. karakteri alır ama 10. karakteri dahil etmez.

        //str datasının ilk karakterini yazdırınız.

        System.out.println(str.substring(0,1));//O. karakteri alır ama 1. karakteri dahil etmez.

        //girilen 4 harfli kelimeyi tersten yazdırınız.

        Scanner dat = new Scanner(System.in);
        System.out.println("4 harfli bir kelime yazınız: ");
        String word = dat.nextLine();

        if (word.length()!=4){
            System.out.println("lütfen 4 harfli bir kelime yazınız");}
        else {
        System.out.println(word.substring(3, 4) + word.substring(2, 3) + word.substring(1, 2) + word.substring(0, 1));
        }


    }


}
