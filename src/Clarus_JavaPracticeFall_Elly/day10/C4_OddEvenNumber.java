package Clarus_JavaPracticeFall_Elly.day10;

public class C4_OddEvenNumber {
    public static void main(String[] args) {
//Math.random() kullanarak cikan sayinin cift ya da tek sayi olup olmamasini kontrol edin
        //Cift sayi ise cift sayi oldugunu, tek ise tek sayi oldugunu yazdiriniz

        //1.yol
        int sayi;

        sayi=(int)(Math.random()*100);
        System.out.println("sayi = " + sayi);
        System.out.println(sayi % 2 == 0 ? "sayı çifttir" : "tek sayıdır");


    }
}
