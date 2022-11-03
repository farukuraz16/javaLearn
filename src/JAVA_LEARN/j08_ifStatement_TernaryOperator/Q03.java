package JAVA_LEARN.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */

    Scanner dat = new Scanner(System.in);
        System.out.println("length? (m) = ");
        float b = dat.nextFloat();
        System.out.println("weight? (kg) = ");
        int k = dat.nextInt();

        int BMI = (int) (k/(b*b));
        System.out.println("BMI = " + BMI);
        if (BMI<=20){System.out.println("oldukca zayifsiniz");}
        else if (BMI>20 && BMI<=25 ){System.out.println("Normal sinirlardasiniz");}
        else if (BMI>25 && BMI<=30 ){System.out.println("Sisman kategorisindesiniz");}
        else System.out.println("Obez grubundasiniz");


    }

}
