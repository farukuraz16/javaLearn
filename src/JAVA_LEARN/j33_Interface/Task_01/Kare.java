package JAVA_LEARN.j33_Interface.Task_01;

public class Kare extends Dikdörtgen{

    //Kare ile Dikdörtgenin çevre alan hesaplamaları aynı formülle gerçekleştirilebilir.
    //bu yüzden Sekil interface'ine implement etmedik ve Dikdörgen classına extend ettik...
    //public class Kare implements Sekil{
/*
    @Override
    public int alan(int... boyut) {
        if (boyut.length==1){//varargs a girilen değer 1 tane ise...
            return boyut[0]*boyut[0];
        }else {
            return boyut[0]*boyut[1];//varargs a girilen değer 1den fazla ise...
        }
    }

    @Override
    public int cevre(int... boyut) {
        if (boyut.length==1){
            return boyut[0]*4;
        }else {
            return (boyut[0]+boyut[1])*2;
        }
    }

 */

}
