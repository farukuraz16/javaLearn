package homeworks;

public class homework_2022_9_14 {
    public static void main(String[] args) {
        /*
        TASK :
        Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        code create edip print ediniz.
        a) 3. bir variable kulanarak
        b) 3. bir variable kullanmadan

	     input	: sayi1=20 ve sayi2=34;
		 output  :  sayi1=34 ve sayi2=20

         */

        int sayi1=20;
        int sayi2=34;
        int sayi3=sayi1+sayi2;
        System.out.println("Gerçek değerler-->\nsayi1="+sayi1+"\nsayi2="+sayi2);
        // a)
        System.out.println("\n\n\"Değiştirilmiş Değerler\"\n\nTask (a) çözümü-->\nsayi1="+(sayi3-sayi1)+"\nsayi2="+(sayi3-sayi2));
        // b)
        System.out.println("\n\nTask (b) çözümü-->\nsayi1="+sayi2+"\nsayi2="+sayi1);

    }
}
