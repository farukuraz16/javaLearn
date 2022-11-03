package JAVA_LEARN.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
    /*TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
      kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
      kontrol edip kalan yıl ve prim gununu print eden code create ediniz..*/

        Scanner dat= new Scanner(System.in);
        System.out.print("genre? (M/F)= ");
        char gnr = dat.nextLine().charAt(0);
        if (gnr != 'F' || gnr !='f'){
            System.out.print("please enter Male of Female (M/F)= ");
            gnr = dat.nextLine().charAt(0);}
        else if (gnr != 'M' || gnr !='m'){
            System.out.print("please enter Male of Female (M/F)= ");
            gnr = dat.nextLine().charAt(0);}


        System.out.print("age?= ");
        int age = dat.nextInt();
        System.out.print("day?= ");
        int day = dat.nextInt();


        if (gnr=='F' || gnr=='f'){
            if (age>60 && day>=6000){
                System.out.println("Deserved to be retired...");}
            else if (age<=60 && day>=6000) {
                System.out.println("You will be deserved to be retired "+(60-age)+" years later.");}
            else if (age>60 && day<6000) {
                System.out.println("You will be deserved to be retired "+(6000-day)+" days later.");}
            else if (age<=60 && day<6000) {
                System.out.println("You will be deserved to be retired "+(6000-day)+" days and also "+(60-age)+" years later.");}
        }
        else if (gnr=='M' || gnr=='m'){
            if (age>65 && day>=7000){
                System.out.println("Deserved to be retired...");}
            else if (age<=65 && day>=7000) {
                System.out.println("You will be deserved to be retired "+(65-age)+" years later.");}
            else if (age>65 && day<7000) {
                System.out.println("You will be deserved to be retired "+(7000-day)+" days later.");}
            else if (age<=65 && day<7000) {
                System.out.println("You will be deserved to be retired "+(6000-day)+" days and also "+(65-age)+" years later.");}
        }









        /*Scanner sc = new Scanner(System.in);
        System.out.print("cinsiyetiniz \n KADIN için-> K\n ERKEK için-> E\n giriniz : ");
        char cnsyt = sc.next().charAt(0);

        if (cnsyt == 'K') {//cinsiyetin kadın olması kontrol edildi
            System.out.println("yasınızı giriniz : ");
            int yas = sc.nextInt();
            if (yas > 60) {//yasın 60 dan buyuklugu kontrol edildi
                System.out.print("prim gununuzu giriniz :");
                int primGunu = sc.nextInt();

                if (primGunu > 6000) {//prim gunu 6000 den buyuk olması kontrol edildi
                    System.out.println("tebrikler NİNEM emekli oldunuz haydı emekli parasını torunlara yedirmeye :) ");
                } else System.out.println("emeliliğiniz için: " + (6000 - primGunu) + " gun  yatırmanız lazım");

            } else System.out.println("emekliliğinize daha : " + (60 - yas) + " yıl daha var");

        } else if (cnsyt == 'E') {
            System.out.println("yasınızı giriniz : ");
            int yas = sc.nextInt();
            if (yas > 65) {//yasın 65 dan buyuklugu kontrol edildi
                System.out.print("prim gununuzu giriniz :");
                int primGunu = sc.nextInt();

                if (primGunu > 7000) {//prim gunu 7000 den buyuk olması kontrol edildi
                    System.out.println("tebrikler DEDEM emekli oldunuz haydı emekli parasını torunlara yedirmeye :) ");
                } else System.out.println("emeliliğiniz için: " + (7000 - primGunu) + " yatırmanız lazım");

            } else System.out.println("emekliliğinize daha : " + (65 - yas) + " yıl daha var");


        } else System.out.println("agam ne oldugunu yaz ona göre emekli edeyim seni :( ");*/
    }
}
