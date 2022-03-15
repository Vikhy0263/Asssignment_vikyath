package com.te.javabasics.patternprograms;

public class PatternNumbers {
	public static void main(String[] args) {
		int i, j, k=1, num = 4;
		for(i = 1; i <= num; i++) {
			k = i;
			for(j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k= k+num-j;
			}
			System.out.println();
		}
		
	}

}
