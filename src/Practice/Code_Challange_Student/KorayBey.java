package Practice.Code_Challange_Student;
/*
       Verilen iki stringin en büyük ortak substringini bulup return eden method create ediniz.
       Ex:
       Str1="bandana"
       Str2="andac"
       Ortak="anda"
       */
public class KorayBey {
    public static void main(String[] args) {

        System.out.println(ortak("bandana", "andac"));

    }

    public static String ortak (String str1, String str2){
String ortak="";
        for (int i = 0; i < str1.length(); i++) {
            for (int j = str1.length(); j > i ; j--) {
                if (str2.contains(str1.substring(i,j))){
                    ortak=str1.substring(i,j).length()>ortak.length()? str1.substring(i,j) : ortak;
                }
            }
        }

     return ortak.length()==0 ? "ortak bir substring yoktur":ortak;
    }
}
