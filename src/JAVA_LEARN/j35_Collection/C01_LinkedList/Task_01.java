package JAVA_LEARN.j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task_01 {
    /*
Task->
Node değerleri "yakup","javaCAN","javaTAR","Teykinay" olan bşe linkedLst create ediniz.
Girilen bir String değeri linkedListte varlığını kmontrol edip varss slilp "Agam elelman halledildi"
yoksa "Agam aradığınız kişiye ulaşılamadı" print eden code create edinzi

 */
    public static void main(String[] args) {


        LinkedList<String> link = new LinkedList<>(Arrays.asList("yakup", "javaCAN", "javaTAR", "Teykinay"));
        Scanner dat = new Scanner(System.in);
        System.out.println("adınız?= ");
        String ad=dat.nextLine();

        if (link.contains(ad)){
            link.remove(ad);
            System.out.println("Agam elelman halledildi");
            System.out.println("link = " + link);
        }else System.out.println("Agam aradığınız kişiye ulaşılamadı");


    }
}
