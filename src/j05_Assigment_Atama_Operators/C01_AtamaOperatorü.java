package j05_Assigment_Atama_Operators;

public class C01_AtamaOperatorü {
    public static void main(String[] args) {
        //    =	        x = 8	    x = 8
        //    +=	    x += 3	    x = x + 3
        //    -=	    x -= 3	    x = x - 3
        //    *=	    x *= 3	    x = x * 3
        //    /=	    x /= 3	    x = x / 3
        //    %=	    x %= 3	    x = x % 3

        int yas = 33;
        System.out.println(yas + 5);//38-> atama (=) olamdıgı için yas=33 hala

        System.out.println("yas = " + yas);//yas = 33
        System.out.println( yas += 5);//38-> şimdi atama yapıldığı için yas=38
    }
}
