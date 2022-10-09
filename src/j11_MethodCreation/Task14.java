package j11_MethodCreation;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("saat ücretiniz?= ");
        double saatlik = sc.nextDouble();

        System.out.println("başlangıç saati: ");
        double start = sc.nextDouble();

        System.out.println("bitiş saati: ");
        double finish = sc.nextDouble();

        System.out.println("mesai kat sayı: ");
        double kat = sc.nextDouble();


        ucretHesapla(start,finish,saatlik,kat);
  /*  Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216
*/

    }//main sonu


    public static void ucretHesapla (double start,double finish,double ücret,double kat){
        if ((finish-start)>8){
            System.out.println("toplam ücret= "+( (((finish - start) - 8) * kat*ücret) + (8 * ücret) ));

        }else System.out.println("toplam ücret= "+((finish - start)*ücret));

    }
}


