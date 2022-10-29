package j23_Varargs_StringBuilder.Varargs;

public class Task_02 {
    public static void main(String[] args) {
        /*
        Task ->
        Girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan METHOD create ediniz.
         */


        System.out.println("toplaCarp(2, 3,5,6,8) = " + toplaCarp(2, 3, 5, 6, 8));

        int arr []= {3, 5, 6, 8};
        System.out.println("toplaCarp(3, arr) = " + toplaCarp(3, arr));


    }//main

public static int toplaCarp (int carpilacakSayi,int...toplanacakSayilar){
        int toplam = 0;
    for (int w: toplanacakSayilar
         ) {toplam+=w;
    }
    return toplam*carpilacakSayi;
}
}
