package j19_StaticVariable;

import java.util.Scanner;

public class Task_03_Runner {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        System.out.println("öğrenci ismi giriniz");
        Task_03_Student ogr1 = new Task_03_Student(dat.next());
    }
}
