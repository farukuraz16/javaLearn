package j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task02_Polindrome {
    public static void main(String[] args) {
         /*
        girilen ifadenin polindrome olmasını kontrol eden method create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler
         */

        Scanner dat = new Scanner(System.in);
        System.out.println("bir metin yazınız: ");
        String klm = dat.nextLine();


        polindrome(klm);

    }//main sonu

    private static void polindrome(String klm) {
        String tersklm = "";
            for (int i=klm.length()-1; i>=0; i--){

                tersklm += klm.charAt(i);
            }
            if (tersklm.equalsIgnoreCase(klm)  ) {
                System.out.println("polindrome: "+tersklm+" --- "+klm);
            }else System.out.println("polindrome değil : "+tersklm+" xxx "+klm);
        }
        }


