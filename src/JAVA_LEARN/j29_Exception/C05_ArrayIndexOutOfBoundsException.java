package JAVA_LEARN.j29_Exception;

public class C05_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        //Arraylerde olmayan bir index elemanıyla işlem yapıldığında oluşan unchecked (RTE) exceptiondır..
        int arr[]={24,27,25,58,66};
        System.out.println("arr[0] = " + arr[0]);//24
       // System.out.println("arr[7] = " + arr[7]);

        try {
            System.out.println("arr[7] = " + arr[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("olmayan array elemanını istiyorsun.. try-catch çalıştı ve kod devam etti");
        }

        try {
            System.out.println("arr[3] = " + arr[3]);
            System.out.println("kırılma olmadı. exception fırlatmadı");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("olmayan array elemanını istiyorsun.. try-catch çalıştı ve kod devam etti");
        }

        System.out.println("bu yazıyı okuyorsan kod kırılmadan deavm etti..");

    }
}
