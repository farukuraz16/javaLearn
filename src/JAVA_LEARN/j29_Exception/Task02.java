package JAVA_LEARN.j29_Exception;

import java.io.IOException;
import java.util.Scanner;

public class Task02 {
    /*
Task -> girilen hava sıcaklığı 10'un altında ise IOException hatası tanımlayıp hatayı print eden method create
edip mainde kontrol ediniz.
Trick->
sicaklikKontrol(int sıcaklık){
 throw new IOException("Hava Gerçekten soğuk dışarı çıkma");}
main(){
Scanner ...
try{
 sicaklikKontrol(int sıcaklık);
}
catch (IOException e) {
}
 */
    public static void main(String[] args) throws IOException {
        Scanner dat = new Scanner(System.in);
        System.out.print("temprature?= ");


        try {
            tempCheck(dat.nextInt());
            System.out.println("Let's go to outdoor activity!");

        } catch (IOException e) {
            System.out.println(e);

        }

    }

    private static void tempCheck(int temp) throws IOException {
        if (temp<10){
            throw new IOException("it is so cold!");
        }

        }
    }



