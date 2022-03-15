package com.te.javabasics.patternprograms;

public class PatternStar {
	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter the number of rows");
		//int rows = scanner.nextInt();
		int rows = 5;
		for(int i = 1; i<= rows; i++) {
			for(int j = rows; j >= i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= (i) -1; k++) {
				System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}
		//scanner.close();
	}	
		
}	
		
	


