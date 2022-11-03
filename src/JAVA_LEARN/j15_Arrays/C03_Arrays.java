package JAVA_LEARN.j15_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        // String'i  array'a cevirme...split()-> girilen parametre değere göre String ifade parçalanır.

        String str = "javaCAN'lara selam olsun. en kısa zamanda bolcana offer sonrası TUZLABALIK :)";
        //task->string ifadeyi kelime sayısını prşnt eden code create ediniz

        String strArray[]=str.split(" ");   // str her " "  karaktere göre parçalanır.
                                                    // her bir parca strArr2in bir elemanı olarak atandı
        System.out.println("Arrays.toString(strArray) = " + Arrays.toString(strArray));
        System.out.println("str.length() = " + str.length());

        //task->string ifadedeki harf  sayısını print eden code create ediniz

        String  harfArr[] = str.split("");//string harf harf ""hiçlik e göre parçalandı
        System.out.println(Arrays.toString(harfArr));//
        System.out.println(harfArr.length);//77

    }

}
