package JAVA_LEARN.j10_StringManupulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

    Scanner dat = new Scanner(System.in);
        System.out.println("any word or sentence?");
        String w = dat.nextLine();
        System.out.println(w.contains(" "));


    }
}

