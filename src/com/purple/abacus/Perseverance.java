package com.purple.abacus;



public class Perseverance {
	public static int findPerseveranceNumber( int testInt, int radix){
		int perseveranceInt = 0;
		String testIntInRadix = Integer.toString(testInt, radix);
		int lengthOfTestInt = testIntInRadix.length();
		
		int tempInt;
		while( lengthOfTestInt > 1 ) {
			tempInt= 1;
			perseveranceInt = perseveranceInt +1;
			for (int i=0; i < lengthOfTestInt; i = i+1) {
				//this gets the digit in the desired base and converts it to base 10 then performs the multiplication
				tempInt = tempInt * (int) Integer.parseInt(Character.toString(testIntInRadix.charAt(i)), radix);
			}
			//so after the for loop tempInt should be the number from multiplying all numbers in base 10;
			//below we define the new testIntInRadix
			testIntInRadix = Integer.toString(tempInt, radix);
			lengthOfTestInt = testIntInRadix.length();
			
		}
		return perseveranceInt;
	}
}
