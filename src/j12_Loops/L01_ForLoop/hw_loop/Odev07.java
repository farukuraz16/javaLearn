package j12_Loops.L01_ForLoop.hw_loop;

public class Odev07 {

    public static void main(String[] args) {
/*
        for (int i = 1; i <= 5; i++) {
            int num = i;
            for (int j = 0; j < 5; j++) {
                if (j < i) {
                    System.out.print(num + " ");
                    num += 4 - j;
                }
            }
            System.out.println();//dumy hayalet*/
//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15


        for (int i = 1; i <=5 ; i++) {
            int s = i;
            for (int j =0 ; j <5 ; j++){

                if (j<i){
                    System.out.print(s+" ");
                    s += 4-j;
                }

            }
            System.out.println();

        }



    }}

