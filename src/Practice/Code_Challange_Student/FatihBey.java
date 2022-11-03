package Practice.Code_Challange_Student;

public class FatihBey {
    public static void main(String[] args) {
        //Verilen String değerinin içerdeği karakter sayılarını yazdıran code create ediniz.
        String str = "hfdsusıpg342g43y+$$%&&&##huıh 1235660+-*/ ";

        String benzersizStr="";

        for (int i = 0; i < str.length(); i++) {
            if (!benzersizStr.contains(""+str.charAt(i))){
                benzersizStr+=""+(str.charAt(i));
            }
        }
        System.out.println("benzersizStr = " + benzersizStr);

        for (int i = 0; i < benzersizStr.length(); i++) {
            int sayac=0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == benzersizStr.charAt(i)){
                    sayac++;
                }

            }System.out.println("Karakter-->"+benzersizStr.charAt(i)+" :"+sayac+" adet var.");

        }

    }
}
