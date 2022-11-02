package Clarus_JavaPracticeFall_Elly.day11;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q03_FirstTenSecond {
    public static void main(String[] args) {
        //Local time ile (// her dakikanın ilk 10  saniyesi

        LocalTime time= LocalTime.now();
       // DateTimeFormatter sn = DateTimeFormatter.ofPattern("ss");
       // System.out.println(time.format(sn));
        if (time.getSecond()<=10) System.out.println(time.getSecond()+" ->ilk 10 saniye içinde");
        else System.out.println(time.getSecond()+" ->ilk 10 saniye dışında");

    }
}
