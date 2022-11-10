package Practice.Code_Challange_Student;
/*
Bir Stringde ilk uniq karakteri bulup return eden method create ediniz.
Ex:
String str1="AAABBBCCCDEF";
String uniqf="D";
 */
public class KorayBey_02 {
    public static void main(String[] args) {

        //System.out.println("uniq (\"AABBCCDEF\") = " + uniq("AABBCCDDEEEFFF"));
        System.out.println("uniq (\"AAABBBCCCDEF\") = " + uniq("AAABBBCCCDEF"));


    }

    private static String uniq(String str) {
        String unig ="";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                //unig=""+str.charAt(i);
                unig=String.valueOf(str.charAt(i));break;

            }
         }


        return unig.length()==0 ? "uniq karakter yok":unig;
    }


}
