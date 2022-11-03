package JAVA_LEARN.j02_DataTypes_WrapperClass;

public class C01_VariableCreate {

    public static void main(String[] args) {
        // 1. yol -> best practice (recommended)
        int yas=40;
        int maas=33000;
        System.out.print("Yas:"); //yas
        System.out.println(yas); //40
        // System.out.println(maas); //33000
        System.out.println("faruk beyin başlangıc maası : "+maas); //faruk beyin başlangıc maası : 33000
        //2. yol ->
        int boy=18; //değeri atanmayan bir int tanımlandı. declaration
        System.out.println("boy:"+boy); //değeri atanmamış bir değişken kullanılamaz

        // 3. yol ->
        int salary, age, weight; //birden çok aynı tipte değişken tanımlandı.
        salary=10000;
        age=40;
        weight=100;//değer ataması yapıldı
        salary=15000;
        System.out.println(salary);
        // int salary=25000; //iki kere aynı değişken tanımlaması yapılamaz.
        System.out.println(salary);

    }
}
