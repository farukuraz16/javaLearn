package j12_Loops.WhileLoopTasks;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */

		int i=999;
		int sayiadedi=0;

		while (i>99){
			if (i%4==0 && i%6==0){
				System.out.print(i+", ");
								sayiadedi++;

			}i--;}
			System.out.println();
			System.out.println("sayı adedi= "+sayiadedi);

/*
		for (i=999;i>99;i--){
			if (i%4==0 && i%6==0){
				System.out.print(i+", ");
				sayiadedi++;

			}

		}

		System.out.println();
		System.out.println("sayı adedi= "+sayiadedi);

		*/

		
		
			
	}

}
