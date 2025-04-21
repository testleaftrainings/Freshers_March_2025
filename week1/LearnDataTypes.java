package week1;

public class LearnDataTypes {

	public static void main(String[] args) {

//Primitive Data Type

		byte byteValue = 127;
//	byte	1 byte	Stores whole numbers from -128 to 127
//	short	2 bytes	Stores whole numbers from -32,768 to 32,767
//	int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
//	long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//	float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//	double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
//	boolean	1 bit	Stores true or false values
//	char	2 bytes	Stores a single character/letter or ASCII values

		short shortValue = 32767;

		char initial = 'S';

		boolean isVisible = true;

		long phoneNumber = 345678909087654l;

		float decimalValue = 10.45f;

		double cgp = 87.97;
		String str = "SV";

		int age = 30;

		System.out.println(shortValue);

		System.out.println(initial);
		System.out.println(isVisible);
		System.out.println(phoneNumber);
		System.out.println(decimalValue);
		System.out.println(cgp);
		System.out.println(age);

		System.out.println(shortValue + " &&&      " + initial);
		System.out.println(shortValue + "\n" + initial + "\n" + isVisible + "\n" + phoneNumber);

	}

}
