package com.purple.abacus;

public class HelloWorld {
	public static void main(String[] args) {
		int testRadix = 3;
		int testP = 4;
		for(int i=0; i < Integer.MAX_VALUE; i = i+1 ){
			if(Perseverance.findPerseveranceNumber(i,testRadix) == testP){
				
				System.out.println("Number: " + i + " Perseverance: " + Perseverance.findPerseveranceNumber(i,testRadix));
				break;
			}
			if((i% 10000) == 0){
				System.out.println("Calculated: " + i);
			}
		}
		
		
		}
}
