package j19_StaticVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_03_Student {
 	 /*
    Task 03 ->
    Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
    Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz
     */

String name;
int maxCredit;
List<Task_03_Lesson> lessonList = new ArrayList<>();

    public Task_03_Student(String studentname) {
        Scanner dat = new Scanner(System.in);
        name = studentname;

        while (maxCredit<=10){
            System.out.println("ders adı giriniz= ");
            Task_03_Lesson ders  = new Task_03_Lesson(dat.next());
            System.out.println(ders.lessonname + "dersinin kredisini giriniz= " );
            ders.lessoncredit= dat.nextInt();

            if (maxCredit+ ders.lessoncredit <=10){
                maxCredit+=ders.lessoncredit;
                lessonList.add(ders);
                continue;
            }else {
                System.out.println("krediniz doldu." + ders.lessonname +" dersini alamazsınız.");
                break;
            }

        }
        System.out.println("studentname = " + studentname);
        System.out.println("aldığınız dersler= ");
        for (Task_03_Lesson lesson:lessonList) {
            System.out.println(lesson.lessonname+" : "+lesson.lessoncredit);
        }
        System.out.println("toplamKredisi() = " + toplamKredisi());

    }

public int toplamKredisi() {
        return maxCredit;
    }


}
