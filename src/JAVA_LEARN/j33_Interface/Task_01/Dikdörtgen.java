package JAVA_LEARN.j33_Interface.Task_01;

public class Dikdörtgen implements Sekil{

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
}

