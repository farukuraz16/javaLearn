package j12_Loops.L01_ForLoop.hw_loop;

public class Odev08 {

    public static void main(String[] args) {

        /*100'den 0'a kadar bütün tek sayıları yazdırınız.
        99-98-97-96....
        100 ve 0 dahil değildir.*/

    for (int i=99; i>0; i-- ){
        int s = i;
        if (s%2!=0){
            System.out.print(s+", ");
        }
    }

    }
}
