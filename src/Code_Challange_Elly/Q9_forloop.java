package Code_Challange_Elly;

public class Q9_forloop {
    public static void main(String[] args) {
        //Type all integers which are divisible by 4 and divisible
        // by 6 from 120 to 11 in the same line with a space between consecutive integers
        for (int i = 6; i <=120 ; i++) {
            if (i%6==0 && i%4==0){
                System.out.print(i+", ");
            }

        }
    }
}
