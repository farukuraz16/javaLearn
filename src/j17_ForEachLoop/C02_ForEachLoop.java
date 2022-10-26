package j17_ForEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        // task array elamanlarının çarpımını print eden code create ediniz...-> with for-each

        int arr[][] = {{2, 3}, {4}, {5, 6, 7}};
        int carpim=1;


        for (int kc[] : arr) {
            for (int a:kc){
               carpim*=a;
            }
        }
        System.out.println("crpm = " + carpim);//crpm = 5040


        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpim*=arr[i][j];

            }

        }
        System.out.println("carpim = " + carpim);

    }

    }

