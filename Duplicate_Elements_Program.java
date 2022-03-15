package com.te.javabasics.patternprograms;

public class Assign4 {
	public static void main(String[] args) {
		int[]arr=new int[] {1,2,3,4,2,8,3,7,8};
		System.out.println("Duplicates elements in given array");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j])
			System.out.println(arr[j]);
			}
		}
		
	}

}
