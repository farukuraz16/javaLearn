package JAVA_LEARN.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task_7 {
    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

        ArrayList<String> isimler = new ArrayList<>(List.of("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
        String a = isimler.get(2);
        String b = isimler.get(7);

        isimler.set(2,b);
        isimler.set(7,a);
        System.out.println("isimler = " + isimler);


    }
}
