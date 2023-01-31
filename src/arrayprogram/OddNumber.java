package arrayprogram;

import java.util.Scanner;

public class OddNumber {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the size of the given Array");
	int size = s.nextInt();
	int a[] = new int[size];
	System.out.println("Enter the Element of the array");
	for(int i=0; i<a.length;i++) {
		a[i]=s.nextInt();
	}
	System.out.println("Odd Number Present in the given array");
	for(int i=0; i<a.length;i++) {
		if(a[i]%2!=0) {
			System.out.println(a[i]);
		}
	}
}
}
