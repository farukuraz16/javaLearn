package JAVA_LEARN.j23_Varargs_StringBuilder.Varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        /*
        arr ve varargs method:
         */

int arr []= {24,42,33,19,34,45,58,38};
        System.out.println("Task 1 -->> Toplam = " + arrTopla(arr));
        System.out.println("Task 2 -->> varargs int değer Toplam = " + varargs(24,42,33,19,34,45,58,38));
        System.out.println("Task 2 -->> varargs array değer Toplam = " + varargs(arr));

//task1 -->>verilen array elemanlarının toplamı için method...
//task2 -->>varargs ile çalışınız..



    }//main sonu

    public static int arrTopla (int[]a){
        int toplam = 0;
        for (int w: a ) {
            toplam+=w;

        }

        return  toplam;
    }

    public static int varargs(int...b){
        int toplam = 0;
        for (int x: b  ) {
            toplam+=x;
                    }
    return  toplam;
    }

}
