package com.te.javabasics.patternprograms;

public class SecondSmallestInArrays {
	public static void main(String[] args) {

		int[] arr = { 2,2,5,8,9,8,9 };
		int temp;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int k = arr.length-1; k >= 0; k--) {
			if (arr[k - 1] != arr[k]) {
				System.out.println("Second smallest element is " + arr[k - 1]);
				return;
			}
		}
	}
}
