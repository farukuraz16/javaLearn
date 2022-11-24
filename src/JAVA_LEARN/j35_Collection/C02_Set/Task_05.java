package JAVA_LEARN.j35_Collection.C02_Set;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Task_05 {
    public static void main(String[] args) {
        /*
    Task->
   return tipi linkedhashset olan removing() isminde bir method oluşturun.
    Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
    Eğer Stringler LinkedHashset 'in içinde varsa, silinmeli.

    Örneğin,
    linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
    String 1= Germany
    String 2 = USA
     Germany ve USA 'i sil.
    Set'i return et.
     */
        LinkedHashSet<String> country = new LinkedHashSet<>(Arrays.asList("Germany" , "France" , "USA" , "Canada" , "Mexico" , "Brazil"));

        String str1= "Germany";
        String str2 = "USA";


        System.out.println(removing(country, str1, str2));

    }

    private static LinkedHashSet removing(LinkedHashSet<String> country, String str1, String str2) {

        if (country.contains(str1)) country.remove(str1);
        if (country.contains(str2)) country.remove(str2);


        return country;
    }
}
