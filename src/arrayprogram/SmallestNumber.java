package arrayprogram;

import java.util.Scanner;

public class SmallestNumber {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the size of the Array");
	int size = s.nextInt();
	int a [] = new int[size];
	System.out.println("Enter the Element of the given Array");
	for(int i=0;i<a.length;i++) {
		a[i]=s.nextInt();
	}
	int small = a[0];
	for(int i=0;i<a.length;i++) {
		if (a[i]<small) {
			small=a[i];
		}
	}
	System.out.println("The smallest number of the given array is :"+small);
}
}
