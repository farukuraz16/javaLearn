package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        // Task ->  bir listte istenen sayının varlığı kontrol eden code create ediniz.

        ArrayList<Integer> listsayi = new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));
        Scanner dat = new Scanner(System.in);
        System.out.println("aranacak sayı= ");
        int aranacak    = dat.nextInt();
        boolean sayi=false;
        for (int i = 0; i < listsayi.size(); i++) {
            if (aranacak== listsayi.get(i)){
                sayi=true;
                System.out.println(" sayısı arrayde var");
                break;
            }//else sayi = false; System.out.println(aranacak+" sayısı arrayde yok");
        }if(!sayi) System.out.println(aranacak+" sayısı arrayde yok");



    }

}
