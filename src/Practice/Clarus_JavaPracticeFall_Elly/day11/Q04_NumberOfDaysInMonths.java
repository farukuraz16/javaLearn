package Practice.Clarus_JavaPracticeFall_Elly.day11;

import java.time.LocalDate;
import java.util.Scanner;

public class Q04_NumberOfDaysInMonths {
    public static void main(String[] args) {
        /*
    Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.
    INPUT:
    Ay Numarasi:
    2
    Yil :
    2016
    OUTPUT :
    Subat 2016 29 Gundur.
     */

        Scanner dat = new Scanner(System.in);
        System.out.println("hangi ay?= ");
        int month = dat.nextInt();
        System.out.println("hangi yıl?= ");
        int year = dat.nextInt();

        LocalDate time = LocalDate.of(year, month,1);
        System.out.println(time.getYear() + " " + time.getMonth() + " " + time.lengthOfMonth()+" days");


    }
}
