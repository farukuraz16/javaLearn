package JAVA_LEARN.j15_Arrays;

import java.util.Arrays;

public class Task_18 {
    public static void main(String[] args) {
        // task-> sayi arr'deki iç arr'lerin toplamını yeni bir arr'ya atayıp print eden code create ediniz
        // input :int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
        // output : int yeniArr[]={6,11,-7}
        int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
 /*
        int yeniArr[]=new int [sayi.length];

int toplam1=0;
int toplam2=0;
int toplam3=0;

        for (int kat = 0; kat <= 0; kat++) {
            for (int daire = 0; daire < sayi[kat].length; daire++) {
                yeniArr[kat]=(toplam1+=sayi[kat][daire]);}
            }
        for (int kat = 1; kat <= 1; kat++) {
            for (int daire = 0; daire < sayi[kat].length; daire++) {
                yeniArr[kat]=(toplam2+=sayi[kat][daire]);}
            }
        for (int kat = 2; kat <= 2; kat++) {
            for (int daire = 0; daire < sayi[kat].length; daire++) {
                yeniArr[kat]=(toplam3+=sayi[kat][daire]);}
            }
        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));
*/


        int yeniArr[]= new int [sayi.length];
        for (int i=0;i< sayi.length;i++){
            for (int j=0;j<sayi[i].length;j++)
            {
                yeniArr[i]+=sayi[i][j];
            }
        }
        System.out.println(Arrays.toString(yeniArr));










    }

    }

