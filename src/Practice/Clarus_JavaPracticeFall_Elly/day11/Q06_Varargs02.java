package Practice.Clarus_JavaPracticeFall_Elly.day11;

public class Q06_Varargs02 {
    public static void main(String[] args) {
        // Create a multiply method with double varargs (return double)

        System.out.println("multiply= " + multiply(5, 6));

    }

    private static double multiply(int ... i) {
        double mult=1;
        for (int a:i) {
            mult*=a;

        }
        return mult;
    }
}
