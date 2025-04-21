package week2.day1;

public class Factorial {

	// 3 -- 3 *2 *1 ==6
	// 5 5*4*3*2*1= 120

	public static void main(String[] args) {
		// initalize variable
		int num = 5;
		int tmp = 1;

		for (int i = num; i >= 1; i--) {

			tmp = tmp * i;
			// 1*5 ==5
			// 5*4 ==20
			// 20*3 ==60
			// 60*2==120
			// 120*1 ==120

			//

		}
		System.out.println("Factorial Value : " + tmp);

	}
}
