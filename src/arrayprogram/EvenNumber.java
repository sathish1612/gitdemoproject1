package arrayprogram;

import java.util.Scanner;

public class EvenNumber {
public static void main(String[] args) {
	Scanner s = new  Scanner(System.in);
	System.out.println("Enter the size of the Array");
	int size = s.nextInt();
	int a[]= new int [size];
	System.out.println("Enter the Elements of the given Array");
	for(int i=0;i<a.length;i++) {
		a[i]=s.nextInt();
	}
	System.out.println("Even Numbers Present in the given Array are :");
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			System.out.println(a[i]);
		}
	}
		
}
}
