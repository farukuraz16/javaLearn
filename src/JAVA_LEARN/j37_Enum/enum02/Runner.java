package JAVA_LEARN.j37_Enum.enum02;

public class Runner {
    public static void main(String[] args) {
        User kll1 = new User();
        kll1.name = "Faruk";
        kll1.durum = Status.ACTIVE;
        kll1.yetki = Role.CUSTOMER;

        User kll2 = new User();
        kll2.name = "Zekiye";
        kll2.durum = Status.INACTIVE;
        kll2.yetki = Role.ADMIN;

if (kll1.yetki==Role.CUSTOMER){
    System.out.println("Müşterisin");
}else {
    System.out.println("Yöneticiin");
}

if (kll2.yetki==Role.ADMIN){
    System.out.println("Müşterisin");
}else {
    System.out.println("Yöneticiin");
}




    }
}
