package com.te.javabasics.patternprograms;

public class Assign1 {
	public static void main(String[] args) {
		
		int[]a=new int[] {22,57,100,450,599};
		int max=a[0];
		
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
				}
		}
		System.out.println("The given Array is:");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
			}
		
			System.out.println("The largest number is:"+max);
	}	
		
}
