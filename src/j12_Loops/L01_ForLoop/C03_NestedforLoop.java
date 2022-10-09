package j12_Loops.L01_ForLoop;

public class C03_NestedforLoop {
    public static void main(String[] args) {
        /*
        eger bir döngünün baody'sinde başka  bir döngü bulunuyorsa bu tür döngülere nested-loop-> içiçe döngü denir
        İç döngü dış döngünün her adımda tekrar çalışır.
        içiçe döngülerde emn içteki döngü en önce çalışır..
         */

        for (int apt =0; apt<=10; apt++){
            System.out.println("dış döngü"+apt);
            for (int daire = 1; daire<6; daire++){
                System.out.println("iç döngü"+daire);
            }
        }
    }
}
