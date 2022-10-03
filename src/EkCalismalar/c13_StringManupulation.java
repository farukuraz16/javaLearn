package EkCalismalar;

import java.util.Scanner;

public class c13_StringManupulation {
    public static void main(String[] args) {

        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner dat = new Scanner(System.in);
        System.out.println("metin giriniz= ");
        String str = dat.nextLine().toLowerCase();
        
        xyzVarMi(str);
        System.out.println(xyzVarMi(str));

        xyzVarMiVoid(str);


    }

    private static void xyzVarMiVoid(String str) {
        if (str.contains("xyz") ? true : false){
            System.out.println("str");
                 }    }

    private static boolean xyzVarMi(String str) {
        if (str.contains("xyz")) {
            return true;
        }else return false;



    }
}
