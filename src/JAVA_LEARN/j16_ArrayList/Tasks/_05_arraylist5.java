package JAVA_LEARN.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;

public class _05_arraylist5 {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static void main(String[] args) {
        ArrayList <String> meyve = new ArrayList<>(List.of("New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));
/*        for (int i = meyve.size()-1; i >=0 ; i--) {
            System.out.print(meyve.get(i)+", ");
        }*/
        rotateList (meyve);

    }

    private static void rotateList(ArrayList<String> meyve) {
        for (int i = meyve.size()-1; i >=0 ; i--) {
            System.out.print(meyve.get(i)+", ");

        }

    }
}

