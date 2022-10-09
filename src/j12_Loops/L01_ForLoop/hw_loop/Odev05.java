package j12_Loops.L01_ForLoop.hw_loop;

import java.util.Scanner;



public class Odev05 {

    /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {



        Scanner dat = new Scanner(System.in);
        System.out.println("sayı= ");
        int sayi = dat.nextInt();
        System.out.println(powerOfThree(sayi));
    }

    private static boolean powerOfThree(int sayi) {
        boolean sonuc = false;
        if (sayi%6==0){
            sonuc=false;
        }else {
            for (int i= 3; i<=sayi ; i*=3){
                if (sayi%i!=0) sonuc=false;
                else sonuc=true;}
        }
        return sonuc;
    }



}
