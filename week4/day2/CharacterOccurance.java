package week4.day2;

public class CharacterOccurance {
	
	
	public static void main(String[] args) {
		
		//to initialize the variable str
		String str= "Testleaf";
		
		//to initialize the variable count
		int count =0;
		
		//to split into character
		char[] charArray = str.toCharArray();
		
		//to iterate the values 
		for (int i = 0; i < charArray.length; i++) {
			
			// to check the value is ==e
			if (charArray[i]=='e') {
				
				//to increasing the count 
				count++;
				
			}
		}
		
		System.out.println(count);
		
		
		
		
		
		
		
		
//		StringBuilder obj = new StringBuilder(str);
//		
//		StringBuilder reverse = obj.reverse();
//		
//		System.out.println(reverse);
//		
		
	}

}
