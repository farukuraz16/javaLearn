package JAVA_LEARN.j32_Abstract.abstract_01;

public abstract class Honda {//parent abstract class
    public abstract void motor();
//abs classta variable tanımlanabilir mi
    String name = "Gülsüm Hanım";


    //variablellar abs tanımlanır mı---->>kesinlikle hayır
    //public abstract int yas=50;


    public void sunroof(){
        System.out.println("keyfini bilirsin! sunroof çok havalı");
    }

    abstract void koltuk();
    abstract void kapı();

    // final void finalMethod();//concerete method body'siz olamaz
    // final abstract void finalMethod();//abs method final olamaz

    //private void privateMethod();//concerete method body'siz olamaz
    //private  abstract void privateMethod();//abs method private olamaz

    //static void gunesMethod();//concerete method body'siz olamaz
    //static abstract void gunesMethod();//abs method static olamaz
    //Honda obj=new Honda();//melekler doğurmaz abs class obj uretmez...

/*    9-  Abs Class'da final ve abs method tanımlanamaz CTE -> final method override edilemyecegi için abs olamaz
            10- Abs Class'da private ve abs method tanımlanamaz CTE -> private method override edilemyecegi için abs olamaz
            11- Abs Class'da static ve abs method tanımlanamaz CTE-> static method override edilemyecegi için abs olamaz

*/
}
