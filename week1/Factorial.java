package week1;

public class Factorial {
	public static void main(String[] args) {

        // SET variable 'fact' to 1 (used to store the factorial result)
        int fact = 1;

        // FOR loop from i = 1 to i = 5 (inclusive)
        // REPEAT the following steps while i <= 5:
        for (int i = 1; i <= 5; i++) {

            // MULTIPLY 'fact' by current value of 'i' and STORE the result back in 'fact'
            fact = fact * i;
        }

        // PRINT the final value of 'fact' to the console
        System.out.println(fact);
  
	}
}
