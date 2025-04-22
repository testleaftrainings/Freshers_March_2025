package week2.day2;

public class StringReverse {

	public static void main(String[] args) {

		String str = "testleaf";

		for (int i = str.length() - 1; i >= 0; i--) {

			System.out.print(str.charAt(i));

		}

		char[] charArray = str.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {

			System.out.println(charArray[i]);
		}

	}

}
