package JAVA_LEARN.j99_Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C12_textRead {
    public static void main(String[] args) throws IOException {
        //TASK 01 --> haluk dosyasini okuyunuz.(Console'a print ediniz.)
        System.out.println("\n TASK 01 --> haluk dosyasini okuyunuz ");
        Path hlk = Path.of("C:\\Users\\faruk\\IdeaProjects\\javaLearn\\src\\JAVA_LEARN\\j99_Lambda\\haluk");//erişilecek dosyanın path'i tanımlandı
        Stream<String> akıs = Files.lines(hlk);
        //Stream<String> akıs1= Files.lines(Path.of("src/J99_Lambda/haluk"));

        akıs.//erişimi verilen dasyadaki satırlar akısa alındı
                forEach(System.out::println);//akısdaki satırlar(lines) print edildi


        //TASK 02 --> haluk.txt dosyasini map okuyunuz.(Console'a buyuk harflerle print ediniz.)
        System.out.println("\n TASK 02 --> haluk.txt dosyasini buyuk harflerle okuyunuz ");
        Files.lines(hlk).map(String::toUpperCase).forEach(System.out::println);

        //TASK 03 --> haluk dosyasindaki ilk satiri kucuk harflerle print ediniz..
        System.out.println("\n TASK 03 --> haluk.txt dosyasindaki ilk satiri kucuk harflerle print ediniz.. ");
        Files.lines(hlk).map(String::toLowerCase).limit(1).forEach(System.out::println);

        //TASK 04 --> haluk dosyasinda "basari" kelimesinin kac satirda gectiginiz print ediniz.
        System.out.println("\n TASK 04 --> haluk dosyasinda \"basari\" kelimesinin kac satirda gectiginiz print ediniz.");
        System.out.println("\"Başarı\" kelimesinden "+Files.lines(hlk).map(String::toLowerCase).filter(t -> t.contains("başarı")).count()+" adet vardır");

        //TASK 05 --> haluk.txt dosyasindaki farkli kelimeleri  print ediniz..
        System.out.println("\nTASK 05 --> haluk.txt dosyasindaki farkli kelimeleri  print ediniz..");
        Files.lines(hlk).map(t -> t.split(" ")).flatMap(Arrays::stream).distinct().forEach(x-> System.out.print(x+" "));


        //TASK 06 --> haluk.txt dosyasindaki tum kelimeleri natural order  print ediniz..
        System.out.println("\nTASK 06 --> haluk.txt dosyasindaki tum kelimeleri natural order  print ediniz.");
        Files.lines(hlk).map(t -> t.split(" ")).flatMap(Arrays::stream).distinct().sorted().forEach(x-> System.out.print(x+" "));


        //TASK 07 --> haluk.txt dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz.
        System.out.println("\nTASK 07 --> haluk.txt dosyasinda \"basari\" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz..");
        System.out.println(Files.lines(hlk).map(t -> t.split(" ")).flatMap(Arrays::stream).filter(t -> t.toLowerCase().equals("başarı")).distinct().count());


        //TASK 08 --> haluk.txt dosyasinda "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.
        System.out.println("\n//TASK 08 --> haluk.txt dosyasinda \"a\" harfi gecen kelimelerin sayisini print eden  programi create ediniz.");
        System.out.println(Files.lines(hlk).map(t -> t.split(" ")).flatMap(Arrays::stream).filter(t -> t.toLowerCase().contains("a")).distinct().count());



        //TASK 09 --> haluk.txt dosyasinda icinde "a" harfi gecen kelimeleri print ediniz.
        System.out.println("\n///TASK 09 --> haluk.txt dosyasinda icinde \"a\" harfi gecen kelimeleri print ediniz.");
        Files.lines(hlk).map(t -> t.split(" ")).flatMap(Arrays::stream).filter(t -> t.toLowerCase().contains("a")).forEach(System.out::println);

        //TASK 10 --> haluk.txt dosyasinda kac /farklı harf kullanildigini print ediniz.
        System.out.println("\n//TASK 10 --> haluk.txt dosyasinda kac /farklı harf kullanildigini print ediniz.");
        System.out.println(Files.lines(hlk).map(t -> t.split("")).flatMap(Arrays::stream).distinct().count());

        //TASK 11 --> haluk.txt dosyasinda kac farkli kelime kullanildigini print ediniz.
        System.out.println("\n//TASK 11 --> haluk.txt dosyasinda kac farkli kelime kullanildigini print ediniz.");
        System.out.println(Files.lines(hlk).map(t -> t.split(" ")).flatMap(Arrays::stream).distinct().count());




    }
}
