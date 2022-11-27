package JAVA_LEARN.j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task02_KartvisitRunner {
    public static void main(String[] args) {


        Map<Integer,Task02_Kartvisit> krtM = new HashMap<>();//Key olarak ID girilecek.. diğer tüm objbilgileri de value olarak gelecek.
        Task02_Kartvisit k1 = new Task02_Kartvisit("Haluk Levent","haluklevent@gmail.com","Üsküdar/İstanbul","05003003030");
        krtM.put(k1.ID,k1);
        System.out.println("krtM = " + krtM);
        System.out.println("krtM.get(k1.ID) = " + krtM.get(k1.ID));
        System.out.println("k1.email = " + k1.email);
        System.out.println("k1.adres = " + k1.adres);

    }
    }

