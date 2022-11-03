package JAVA_LEARN.j11_MethodCreation;


import java.util.Scanner;

/*
Recursive  call edildiğinde run time'da programa ekstradan yük getiren bir yapıdadır
çünkü bir fonksiyon kendi kendini çağırdığında her çağırmada yığında (stack) bir işlem gerçekleşir ve bir bellek konumu oluşur.
Bu yüzden özyineleme ile yapılan hesaplamalar daha yavaş ve verimsizdir.
Peki özyinelemeyi neden kullanıyoruz?
Bazı karmaşık çözülmesi güç problemlerde döngülere göre daha kısa ve anlaşılır olduğu için.
 */
public class C05_RecursiveMethod {
    public static void main(String[] args) {
    /*faktoriyel
girilen sayının faktoriyelini hesaplayan method create ediniz...
     */

        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayı giriniz= ");
        int s = sc.nextInt();
        System.out.println(faktoriyel(s));
    }//main dışı

    public static int faktoriyel (int a) {
            if (a>=1){
                return a*faktoriyel(a-1);
            }else return 1;

    }

}
