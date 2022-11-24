package JAVA_LEARN.j29_Exception;

public class C03_ClassCaseException {
    public static void main(String[] args) {
        // ClassCastException -> Biribirne dönüştürülemeyen data type'lar biribirine dönüştürüldüğünde oluşan RTE Exception dur

        Object obj="Javacalara selam";
        String str= (String) obj;//Object data type, String data type a çevrildi.
        System.out.println("str = " + str);

        Object sayi1= 10;
        //String str2 = (String) sayi1;//ClassCaseException
        //System.out.println("str2 = " + str2);//ClassCaseException
      try {
          String str2 = (String) sayi1;
          System.out.println("str2 = " + str2);
      }catch (ClassCastException e){
          System.out.println("int obj, string olur mu yaw...");//burası çalışmışsa, kod kırılmadan run olmuştur

       }
        System.out.println("kod sorunsuz çalıştı.. devam ettti...");

      try {
          String str3 = (String) obj;
          System.out.println("sorunsuz çalıştı. exception fırlatmadı");
      }catch (ClassCastException e){
          System.out.println("int obj, string olur mu yaw...");
      }
    }
}
