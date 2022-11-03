package Practice.Homework_ArithmeticOperators;

public class Task01 {
	public static void main(String[] args) {
		int x = 4;
        x++;            //print 4   value (x=5)
        x += x;         //print 10  value (x=10)
        --x;            //print 9   value (x=9)
        x = 7 + x;      //print 16  value (x=16)
        x *= x;         //print 256 value (x=256)
        x -= 3;         //print 253 value (x=253)

        System.out.println(" x = " + x );
        
        int a = 3;
        double d = 4.5;

        d+=a;   //print 7.5  value (d=7.5)
        a+=d;   //print 10.5 value (a=10)
        d-=a;   //print -3.5 value (d=-2.5)
        a-=d;   //print 12   value (a=12)

        System.out.println(" d = " + ++d );//print -1.5  value d=-1.5
        System.out.println(" a = " + a-- );//print 12    value a=11
        
        

	}

}
