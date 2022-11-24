package JAVA_LEARN.j29_Exception;

import java.util.Scanner;

public class Task01 {/*
        Task -> Girilen password'un 6 karakterden az 10 karakterden fala olmamasını kontrol eden code create ediniz
         */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("pasword gir= ");
        String password = sc.nextLine();
try {
if (password.length()<6){
throw new IllegalArgumentException("6 karakterden az girdin");
} else if (password.length()>10) {
    throw new IllegalArgumentException("10 karakterden fazla girdin");

}else System.out.println("password geçerli. şifreniz: "+password);
} catch (IllegalArgumentException e) {
    System.out.println(e);
    System.out.println("bir türlü password giremedin");

}
        System.out.println("sorun yok DEVAMKEE");
    }
}
