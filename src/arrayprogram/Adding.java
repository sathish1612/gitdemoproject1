package arrayprogram;

import java.util.Scanner;

public class Adding {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size=s.nextInt();
	int a [] = new int[size];
	System.out.println("Enter the Element of the array");
	for(int i=0;i<a.length;i++) {
		a[i]=s.nextInt();
	}
	int b=0;
	for(int i=0;i<a.length;i++) {
		b=b+a[i];
	}
	System.out.println("Sum of the given array : "+b);
}
}
