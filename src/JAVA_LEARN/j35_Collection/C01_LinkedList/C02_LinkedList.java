package JAVA_LEARN.j35_Collection.C01_LinkedList;

import java.util.LinkedList;
import java.util.Objects;

public class C02_LinkedList {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();//datatype OBJ.. yani herkesi alır...
        list.add("Nazım");
        list.add('$');
        list.add(1453);
        System.out.println("list = " + list);//[Nazım, $, 1453]
//bad practice.. sistemi çok yavaşlatır. tavsiye edilmez!!!!


    }

}
