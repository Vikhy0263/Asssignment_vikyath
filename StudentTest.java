package com.te.Basic.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(21, "Vikhy", "Mangalore", 25, 99));
		arrayList.add(new Student(22, "Rakeshsh", "Banglore", 26, 35));
		arrayList.add(new Student(23, "Madhan", "mysore", 22, 110));
		arrayList.add(new Student(24, "Rashmi", "chitradurga", 21, 105));
		arrayList.add(new Student(25, "Sanjana", "Hyderabad", 20, 90));
		boolean count = true;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter 1 to sort by Id");
			System.out.println("Enter 2 to sort by Name");
			System.out.println("Enter 3 to sort by Address");
			System.out.println("Enter 4 to sort by Age");
			System.out.println("Enter 5 to sort by marks");

			int sct = scanner.nextInt();

			switch (sct) {
			case 1:
				Collections.sort(arrayList, new CompareById());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;

			case 2:
				Collections.sort(arrayList, new CompareByName());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;

			case 3:
				Collections.sort(arrayList, new CompareByAddress());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;
			case 4:
				Collections.sort(arrayList, new CompareByAge());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;
			case 5:
				Collections.sort(arrayList, new CompareByMarks());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;

			}
			System.out.println("Please type YES to continue or NO to exit");
			String str=scanner.next();
			
			if(str.equalsIgnoreCase("YES")) {
				count=true;
				
			}else if(str.equalsIgnoreCase("NO")) {
				count=false;
				System.out.println("Terminated...Thank you......");
			}
			

		} while (count == true);

	}
}
