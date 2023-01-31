package arrayprogram;

import java.util.Scanner;

public class ReverseArrayWithOutUsingExtraArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size = sc.nextInt();
	int a[]=new int[size];
	System.out.println("enter the element of the given array");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	
	for(int i=0,j=a.length-1; i<a.length/2 && j>=a.length/2; i++,j--) {
	int temp =a[i];
	a[i]=a[j];
	a[j]=temp;
	}
	for (int i=0; i<a.length;i++) {
		System.out.println(a[i]);
	}
}
}
