package arrayprogram;

import java.util.Scanner;

public class LargestNumber {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size = s.nextInt();
	int a[] = new int[size];
	System.out.println("Enter the Element of the array");
	for(int i=0;i<a.length;i++) {
		a[i]=s.nextInt();
	}
	int large = a[0];
	for(int i=0; i<a.length;i++) {
		if(a[i]>large) {
			large=a[i];
		}
	}
	System.out.println("The largest Number of the given Array is :"+large);
}
}
