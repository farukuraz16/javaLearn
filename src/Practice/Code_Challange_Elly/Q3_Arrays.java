package Practice.Code_Challange_Elly;

import java.util.Arrays;

public class Q3_Arrays {
    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */

       // String str = "HeySiri";
       // //str= "ByeSiri";
       // str = str.replace("Hey", "Bye");
       // System.out.println("str = " + str);
//
       // String arr[] = new String[1];
       // arr[0] = str;
       // System.out.println(Arrays.toString(arr));

        //2. yol

        String str1= "HeySiri";
        String newStr []= str1.split("y");
        System.out.println(Arrays.toString(newStr));
        newStr[0]="Bye";
        str1=newStr[0]+newStr[1];

        String str2[]=new String[1];
        str2[0]=str1;
        System.out.println(Arrays.toString(str2));


    }
}
