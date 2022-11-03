package JAVA_LEARN.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task09 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
    List<Integer> sayi= new ArrayList<>(List.of(1,2,3,4));
    int qrtoplam=0;
        for (int i = 0; i < sayi.size(); i++) {
            qrtoplam+= Math.pow(sayi.get(i),2);

        }

        System.out.println("qrtoplam = " + qrtoplam);
    }
}

