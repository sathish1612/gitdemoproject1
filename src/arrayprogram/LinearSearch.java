package arrayprogram;

import java.util.Scanner;

public class LinearSearch {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of the Array");
	int size = sc.nextInt();
	int count =0;
	int a[] = new int [size];
	System.out.println("Enter element in the Array");
	for (int i=0 ; i<a.length;i++) {
		a[i]= sc.nextInt();
		//System.out.println(a[i]);
	}
	System.out.println("Enter key Element");
	int key=sc.nextInt();
	for (int i=0; i< a.length;i++) {
	if (a[i]==key) {
		count++;
		break;
	}
	
	}
	if (count!=0) {
		System.out.println("key element is found");
	}
	else {
		System.out.println("key element is not found");
	}
	
}
}
