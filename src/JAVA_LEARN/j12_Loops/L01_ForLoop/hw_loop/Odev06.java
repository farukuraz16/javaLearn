package JAVA_LEARN.j12_Loops.L01_ForLoop.hw_loop;

public class Odev06 {

    public static void main(String[] args) {

        /* İlk 10 doğal sayının toplamını hesaplamak için bir kod yazın.

         */

        int toplam = 0;
        for (int i = 0; i < 11; i++) {
            int s = i;
            toplam = toplam + s;

        }
        System.out.println(toplam);

    }
}
