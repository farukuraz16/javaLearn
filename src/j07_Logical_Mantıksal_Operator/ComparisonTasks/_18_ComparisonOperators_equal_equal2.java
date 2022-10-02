package j07_Logical_Mantıksal_Operator.ComparisonTasks;

import java.util.Scanner;

public class _18_ComparisonOperators_equal_equal2 {

    public static void main(String[] args) {

    /*    Oluşturulan double'lar hakkında (num1, num2)
          birbirine eşit olup olmadıklarını doğrulayın.
          Eğer eşitlerse konsolda true yazacaktır.  */
// Task18
        Scanner dp = new Scanner(System.in);
        System.out.print("num1 giriniz= ");
        double num1 = dp.nextDouble();
        System.out.print("num2 giriniz= ");
        double num2 = dp.nextDouble();
        // Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
        System.out.println(num1==num2);
    }
}
