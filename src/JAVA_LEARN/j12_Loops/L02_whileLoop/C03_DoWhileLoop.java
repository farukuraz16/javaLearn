package JAVA_LEARN.j12_Loops.L02_whileLoop;

import java.util.Scanner;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);

        // task-> girilen tamsayını pozitif tam bolen sayısını print eden code create ediniz...
        // 20 -> 1,2,4,5,10,20: 20'nin 6 tane tam böleni var
        // 30 -> 1,2,3,5,6,10,15,30: 30'nin 8 tane tam böleni var

        System.out.println("bir tam sayı giriniz= ");
        int s = dat.nextInt();
        int a = 1;
        int bolenadedi = 0;
        System.out.print(s+" -> ");
        while (a <= s) {
            if (s % a == 0) {
                System.out.print(a + ", ");
                                bolenadedi++;
            }
            a++;
        }
        System.out.print(": "+s+"'nin "+bolenadedi+" tane böleni vardır.");

    }//main


}
