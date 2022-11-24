package JAVA_LEARN.j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/*
         task -> Verilen bir integer listin tek  elemanrının karesini
         tersten iterator  print eden code create ediniz
         */
public class Task_01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));
        ListIterator<Integer> it1 = list.listIterator();

        while (it1.hasNext()){
            it1.next();
        }
        while (it1.hasPrevious()){
            int a=it1.previous();
            if (a%2!=0){
                System.out.print((a*a)+" ");
            }
        }
    }
}
