package Code_Challange_Student;

import java.util.Arrays;
import java.util.Scanner;

public class MerveHanım {
    public static void main(String[] args) {
        /*
        Java N ve M Boyutlu Dizinin Satırlarının Toplamını Bulma
        Bu örnekte N ve M değerlerini kullanıcıdan alıp, iki boyutlu dizi oluşturacağız.
        Daha sonra da dizinin elemanlarını kullanıcıdan alıp, her satırın sonuna o satırın toplamını yazdıracağız.
         örneğin;
         12    12     24
         5     15     20
         12    18     30
         */
        int toplam;
        Scanner dat = new Scanner(System.in);
        System.out.println("kaç satır olsun= ");
        int satir= dat.nextInt();
        System.out.println("kaç sütun olsun= " );
        int sütun= dat.nextInt();
        System.out.println("\n"+(satir*sütun)+" adet sayı gireceksiniz.\n" );
        int [][] arr= new int [satir][sütun];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sütun; j++) {
                System.out.println(i+"-"+j+" indexi için bir sayı giriniz=");
                arr[i][j]=dat.nextInt();   }   }

        System.out.println("satır ve sütunlara göre girilen sayılar="+ Arrays.deepToString(arr)+"\n");

        for (int i = 0; i < satir; i++) {
            toplam=0;
            for (int j = 0; j < sütun; j++) {
                toplam+=arr[i][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("sayılarının toplamı="+toplam);
            System.out.println();
        }


    }

    }

