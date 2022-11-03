package JAVA_LEARN.j22_DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C06_Duration {
    public static void main(String[] args) {
        LocalTime gece= LocalTime.of(8,0);
        LocalTime oglen= LocalTime.of(13,30);
        Duration fark= Duration.between(gece, oglen);
        System.out.println("fark = " + fark);

        System.out.println("fark.getSeconds() = " + fark.getSeconds());
        System.out.println("fark.toHours() = " + fark.toHours());
        System.out.println("fark.toMinutes() = " + fark.toMinutes());
        System.out.println("fark.hashCode() = " + fark.hashCode());

        Duration fark1= Duration.between(oglen, gece);//eski değer verir...
        System.out.println("fark1 = " + fark1);
    }
}
