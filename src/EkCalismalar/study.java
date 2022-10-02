package EkCalismalar;



public class study {
    public static void main(String[] args) {
   /* Scanner dat = new Scanner(System.in);
        System.out.print("Number of classes held = ");
        double a = dat.nextInt();
        System.out.print("Number of classes attended = ");
        double b = dat.nextInt();
        float p = (float) ((b*100)/a);
        System.out.print("percentage = %" + p);
        if (p>=75) {System.out.println("\nallowed");}
        else {
            Scanner ask = new Scanner(System.in);
            System.out.println("\ndo you have mediacal issue? (Y/N) = ");
            String answ = ask.nextLine();

            if (Objects.equals(answ, "Y")) {System.out.println("\nallowed");}

                else {System.out.println("\ndenied");}
        } */


//Length and breadth of a rectangle are 5 and 7 respectively.
// Write a program to calculate the area and perimeter of the rectangle.
  /*  int a=5;
    int b=7;
        System.out.println("the area of the rectangle= "+(5*7));
        System.out.println("the perimeter of the rectangle= "+((5+7)*2));


        //Write a program to add 8 to the number 2345 and then divide it by 3.
        // Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5.
        // Display the final result.
        int a=2485; a+=8; a/=3;
        int b=a%5; b*=5;
        System.out.println(b);

//Write a program to check if the two numbers 23 and 45 are equal.
        //Assign values of variables 'a' and 'b' as 55 and 70 respectively
        // and then check if both the conditions 'a < 50' and 'a < b' are true.
        int a=55;
        int b=70;
        System.out.println(a<50||a<b);
*/
//If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ),
// write a program to calculate his total marks and percentage marks.
/*
int a=6;
int b=8;
a=a+b; b=a-b; a=a-b;
        System.out.println("a="+a+"\nb="+b);
*/
//The total number of students in a class are 90 out of which 45 are boys.
// If 50% of the total students secured grade 'A' out of which 20 are boys,
// then write a program to calculate the total number of girls getting grade 'A'.
  /*      int c=90;
        int b=45;
        int g=c-b;
        int gradeA=90/2;
        System.out.println("girls gradeA= " + (gradeA-20));
*/
//Write a program to calculate the sum of the first and the second last digit of a 5 digit.
//E.g.- NUMBER : 12345        OUTPUT : 1+4=5
/*
        Scanner dat=new Scanner(System.in);
        System.out.println("please write a 5 digit number = ");
        int n, first, second, third, fourth, fifth, sum;
        n= dat.nextInt();
        first=n/10000;//1
        n=n%10000;//2345

        second=n/1000;//2
        n=n%1000; //345

        third=n/100;//3
        n=n%100; //45

        fourth=n/10;//4
        fifth=n%10; //5

        System.out.println("sum = " + (first+third));
*/

//Write a program to reverse a 3-digit number. E.g.-Number : 132        Output : 231
  /*      Scanner dat = new Scanner(System.in);
        System.out.println("pls insert a number a 3-digit number: ");
        int num= dat.nextInt();
        int num1=num/100;
        System.out.println("num1 = " + num1);
        int num2=num/10%10;
        System.out.println("num2 = " + num2);
        int num3=num%10;
        System.out.println("num3 = " + num3);
        System.out.println("reverse = " + num3+num2+num1);
*/

//Take a 4 digit number.
// Write a program to display a number whose digits are 2 greater than
//the corresponding digits of the number TAKEN.
//For example, if the number which was taken is 5696, then the displayed number should be 7818.
/*
        Scanner dat = new Scanner(System.in);
        System.out.println("pls insert a number a 4-digit number: ");
        int num= dat.nextInt();
        int num1=num/1000;
        System.out.println("num1 = " + num1);
        int num2=num/100%10;
        System.out.println("num2 = " + num2);
        int num3=num/10%10;
        System.out.println("num3 = " + num3);
        int num4=num%10%10;
        System.out.println("num4 = " + num4);
        System.out.println("new number plus2 = " +((num1+2)%10)+((num2+2)%10)+((num3+2)%10)+((num4+2)%10));
*/
/*
Scanner dat= new Scanner(System.in);
        System.out.println("insert a number = ");
        int a = dat.nextInt();
        System.out.println("insert a number = ");
        int b = dat.nextInt();
        int sum=a+b;
        int mult=a*b;
        System.out.println(sum+mult);
        System.out.println(sum*mult);
*/
/*
        Scanner dat = new Scanner(System.in);
        System.out.println("pls insert a number= ");
        float a = dat.nextFloat();
        System.out.println("pls insert a what power you need= ");
        float p = dat.nextFloat();
        System.out.println("result = " + Math.pow(a,p));
*/
 /*   Scanner dat = new Scanner(System.in);
        System.out.println("Enter first number= ");
        int a = dat.nextInt();
        System.out.println("Enter second number= ");
        int b = dat.nextInt();
        System.out.println("Enter third number= ");
        int c = dat.nextInt();
        System.out.println("All are equal= " +(a==b&b==c&c==a));
        System.out.println("two of them are equal at least= "+ (a==b||b==c||c==a));
*/
//Write a program to enter the values of two variables 'a' and 'b' from keyboard and
// then check if both the conditions 'a < 50' and 'a < b' are true.
/*
        Scanner dat = new Scanner(System.in);
        System.out.print("pls insert a number= ");
        float a = dat.nextFloat();
        System.out.print("pls insert a number= ");
        float b = dat.nextFloat();
        System.out.println("result= " + (a<50 & a<b));
*/
//If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
// write a program to calculate his total marks and percentage marks.
  /*      Scanner dat = new Scanner(System.in);
        System.out.print("Mark1 = ");
        float Mark1= dat.nextFloat();
        System.out.print("Mark2 = ");
        float Mark2= dat.nextFloat();
        System.out.print("Mark3 = ");
        float Mark3= dat.nextFloat();
        System.out.println("Mark1st = " + Mark1 + "\nMark2nd = " + Mark2 + "\nMark3rd = " + Mark3);
        System.out.println("Total Mark = " + (Mark1+Mark2+Mark3));
        System.out.println("Percentage Mark = " + Math.round((Mark1+Mark2+Mark3)/3));
*/
     /*   Scanner dat = new Scanner(System.in);
        System.out.print("write a character ascii value= ");
        String ch = dat.nextLine();
        char c= ch.charAt(0);
        int ascii = (int) c;
        System.out.println("ascii = " + ascii);*/

//Write a program to assign a value of 100.235 to a double variable and then convert it to int.
/*
        Scanner dat = new Scanner(System.in);
        System.out.print("write a character ascii value= ");
        double a = dat.nextDouble();
        System.out.println((int)a);*/

//Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.

  /*      int x = 3+'d';
        System.out.println((char)x);
*/

//Write a Java program to print an int, a double and a char on screen.
//100.235
/*
        char a = 'd';
        System.out.println((char)(3+(int)a));

        int x = 3+'d';
        System.out.println((char)x);
*/
//Take values of length and breadth of a rectangle from user and check if it is square or not.
/*
    Scanner dat = new Scanner(System.in);
        System.out.println("bir kenar uzunluğu giriniz= ");
        int a = dat.nextInt();
        System.out.println("bir kenar uzunluğu giriniz= ");
        int b = dat.nextInt();
        String kare = "";

        if (a!=0 & b!=0){

            if (a==b){
            System.out.println("bu bir karedir"+"\nkarenin alanı = " + (a*b)+"\nkarenin çevresi = " + ((a+b)*2));
                    }

            if (a>b || a<b){
            System.out.println("bu bir dikdörtgendir"+"\ndikdörtgenin alanı = " + (a*b)+"\ndikdörtgenin çevresi = " + ((a+b)*2));
        }}
*/
//A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//Ask user for quantity
//Suppose, one unit will cost 100.
//Judge and print total cost for user.
/*
        Scanner dat = new Scanner(System.in);
        System.out.print("quantity= ");
        int q = dat.nextInt();
        double d = 0.1;
        String b ="";
        b = q>=1000 ? "total cost= " + ((100*q)*0.90) : "total cost= " + (100*q);
        System.out.println(b);
*/
//A school has following rules for grading system:
//a. Below 25 - F
//b. 25 to 45 - E
//c. 45 to 50 - D
//d. 50 to 60 - C
//e. 60 to 80 - B
//f. Above 80 - A
//Ask user to enter marks and print the corresponding grade.
/*
        Scanner dat = new Scanner(System.in);
        System.out.print("grade? = ");
        double grd = dat.nextDouble();
        if (grd<25) {System.out.println("grade "+"F");}
        else if (grd<45) {System.out.println("grade "+"E");}
        else if (grd<50) {System.out.println("grade "+"D");}
        else if (grd<60) {System.out.println("grade "+"C");}
        else if (grd<80) {System.out.println("grade "+"B");}
        else if (grd>=80) {System.out.println("grade "+"A");}*/
/*
        Scanner dat=new Scanner(System.in);
                System.out.println("age1?= ");
                int a=dat.nextInt();
                System.out.println("age2?= ");
                int b=dat.nextInt();
                System.out.println("age3?= ");
                int c=dat.nextInt();
                if(a>b&a>c){System.out.println(a+" older");
                if(b>c){System.out.println(c+" youngest");}
                else{System.out.println(b+" youngest");}}

                else if(b>a&b>c){System.out.println(b+" older");
                if(a>c){System.out.println(c+" youngest");}
                else{System.out.println(a+" youngest");}}

                else if(c>a&c>b){System.out.println(c+" older");
                if(a>b){System.out.println(b+" youngest");}
                else{System.out.println(a+" youngest");}}

*/
//If
//x = 2
//y = 5
//z = 0
//then find values of the following expressions:
//a. x == 2
//b. x != 5
//c. x != 5 && y >= 5
//d. z != 0 || x == 2
//e. !(y < 10)
/*
public class study {
    public static void main(String[] args) {
    int x =2, y=5, z=0;
        System.out.println(x==2);
        System.out.println(x!=5);
        System.out.println(x!=5 && y>=5);
        System.out.println(z!=0 || x==2);
        System.out.println(!(y>10));*/


    }
}