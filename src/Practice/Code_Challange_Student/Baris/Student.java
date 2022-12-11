package Practice.Code_Challange_Student.Baris;


import java.util.ArrayList;
import java.util.Scanner;

public class Student {
Scanner sc = new Scanner(System.in);

private String name;
private int num;

    public Student() {
    }

    public Student(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    ArrayList<Student> student = new ArrayList<>();

    public void studentKayıt(){
        System.out.println("Lütfen adınızı ve soyadınızı giriniz: ");
        name= sc.nextLine();
        System.out.println("Lütfen öğrenci numaranızı giriniz: ");
        num= sc.nextInt();

        Student ogr1 = new Student(name,num);

        student.add(ogr1);

    }








}
