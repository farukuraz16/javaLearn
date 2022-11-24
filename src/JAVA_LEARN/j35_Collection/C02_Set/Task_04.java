package JAVA_LEARN.j35_Collection.C02_Set;

import java.util.Arrays;
import java.util.HashSet;

public class Task_04 {
    public static void main(String[] args) {
        /*
    Task
    Parametre olarak bir String HashSet   ve  iki String alan  return type HashSet
   olan  changeSet() isminde bir method oluşturun.
    Eğer HashSet String 1 e sahipse,HashSet'in  String 1 elemanını String 2 ile değiştirin.
    ÖRNEK:
    hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
    String 1 = banana
    String 2 = peach
    CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
     */

        HashSet<String> fruits = new HashSet<>(Arrays.asList("banana" , "strawberry" , "kiwi" , "pineapple"));
        String str1= "banana";
        String str2= "peach";

        System.out.println(changeSet(fruits, str1, str2));


    }

    private static HashSet changeSet(HashSet<String> fruits, String str1, String str2) {

    if (fruits.contains(str1)){
        fruits.remove(str1);
        fruits.add(str2);
    }



    return  fruits;
    }
}
