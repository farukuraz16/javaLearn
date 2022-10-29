package j23_Varargs_StringBuilder.Varargs;

public class Task_03 {
    public static void main(String[] args) {
        /*
        Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
         */

        int sayi=5;
        String str1="faruk";
        String str2="muharrem";
        String str3="ayşe";

carpim(sayi, str1,str2,str3,"adffasdf","hakkıdırhakkındahakkındaki");//istersek başka kelimeler de girebilriz.


    }//main

public static void carpim(int a,String... s) {
        String enUzun="";

    for (String w: s) {
        if (w.length()>enUzun.length()){
             enUzun=w;
    }
    }
    System.out.println("enUzun = " + enUzun+" ,"+ enUzun.length());

    System.out.println(enUzun.length()+"x"+a+" = "+ enUzun.length()*a);

}
}
