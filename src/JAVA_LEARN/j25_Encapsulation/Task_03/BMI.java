package JAVA_LEARN.j25_Encapsulation.Task_03;
/* Task->
     Bmı class fields -> name, age, weight,height: encapsulated
     getBMI() method -> bmi=weight/(height*height) return type olmalı
     getStatus() method -> bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez return type
     runner class obj ile dataları print eden code create ediniz
     */
public class BMI {
    private String name;
    private int age;
    private double weight, height;

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public double getBMI (){
        double bmi= weight/(height*height);

        return bmi;
    }

    public String getStatus (){
        if (getBMI()<18.5) return "Zayıf";
        else if (getBMI()<25) return "Normal";
        else if (getBMI()<30) return "Kilolu";
        else return "Obez";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


}



class RunnerBMI{
    public static void main(String[] args) {
    BMI obj = new BMI("Faruk",42,100,1.78);

        System.out.println("obj.getName() = " + obj.getName());
        System.out.println("obj.getAge() = " + obj.getAge());
        System.out.println("obj.getHeight() = " + obj.getHeight());
        System.out.println("obj.getHeight() = " + obj.getHeight());

        System.out.println("obj.getBMI() = " + obj.getBMI());
        System.out.println("obj.getStatus() = " + obj.getStatus());
    }

}
