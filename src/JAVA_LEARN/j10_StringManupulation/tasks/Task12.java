package JAVA_LEARN.j10_StringManupulation.tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */

        Scanner dat = new Scanner(System.in);
        System.out.println("Ad Soyad= ");
        String as = dat.nextLine();
        String name1= as.toUpperCase().substring(0,1);
        String name2= as.toUpperCase().substring(as.indexOf(" ")+1,as.indexOf(" ")+2);
        String name3= as.toUpperCase().substring(as.lastIndexOf(" ")+1,as.lastIndexOf(" ")+2);
        System.out.println(name1+"."+name2+"."+name3+".");



    }
}
