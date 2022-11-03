package JAVA_LEARN.j10_StringManupulation;

        import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner dat = new Scanner(System.in);
        System.out.println("Please enter a three letter name: ");
        String n = dat.nextLine();
        if (n.length()==3){

            System.out.println(n.charAt(0) == n.charAt(1) && n.charAt(0) == n.charAt(2) ? "same letters" : "unique letters");
            System.out.println(""+n.charAt(0)+"\n" +n.charAt(1) +"\n"+ n.charAt(2));
                    }
        else System.out.println("Please enter a three letter name");
}}