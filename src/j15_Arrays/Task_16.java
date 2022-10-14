package j15_Arrays;

public class Task_16 {
    public static void main(String[] args) {
        // task-> sayi arr'deki son elemanların çarpımını print eden code create ediniz

        // task-> sayi arr'deki son elemanların çarpımını print eden code create ediniz
        int sayi[][]={{1,2,3},{9,8},{24,0,4}};

        int crpm=1;
/*
        for (int kat = 0; kat < sayi.length; kat++) {
            crpm*=sayi[kat][sayi[kat].length-1];}
             */

        for (int i = 0; i < sayi.length; i++) {
            crpm*=sayi[i][sayi[i].length-1];
            }
                System.out.println("crpm = " + crpm);


    }}
