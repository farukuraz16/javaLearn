package JAVA_LEARN.j12_Loops.WhileLoopTasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */
        Scanner dat = new Scanner(System.in);
        System.out.println("metin gir=");
        String metin = dat.nextLine();
        int harf=0;
        int karakter=0;
        int rakam=0;



        for (int i=0 ; i<metin.length(); i++ ){
            if (metin.charAt(i)>='A' && metin.charAt(i)<='z') {harf++;}
            if (metin.charAt(i)>='0' && metin.charAt(i)<='9') {rakam++;}
            else {karakter++;}
}
        System.out.println("harf="+harf);
        System.out.println("karakter="+karakter);
        System.out.println("rakam="+rakam);

    }

}
