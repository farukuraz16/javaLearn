package JAVA_LEARN.j15_Arrays;

public class Task_17 {
    public static void main(String[] args) {
        // task-> sayi arr'deki en buyk elemanı print eden code create ediniz...
        int sayi[][]={{100,2,3},{19,-8},{24,10,-41}};//24

        int maxEleman= sayi[0][0];

        for (int kat = 0; kat < sayi.length; kat++) {
            for (int daire = 0; daire < sayi[kat].length ; daire++) {
                if (sayi[kat][daire]>maxEleman){
                    maxEleman=sayi[kat][daire];
                }
            }
        }
        System.out.println("maxEleman = " + maxEleman);
    }
}
