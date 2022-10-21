package Code_Challange_Elly;

public class Q9_Arrays {
    public static void main(String[] args) {

        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */

    int arr [][]= {{1,3,6},{2,8},{5,7,9,14}};

        System.out.println("\nçift sayıların toplamı= "+ cift(arr));


    }

    private static int cift(int[][] arr) {
        int toplam = 0;
        System.out.print("çift sayılar= ");
        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i][j]%2==0){
                    System.out.print(arr[i][j]+", ");
                    toplam +=arr[i][j];
                } }
        }

        return toplam;
    }
}
