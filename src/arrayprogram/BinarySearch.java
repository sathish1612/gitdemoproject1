package arrayprogram;

import java.util.Scanner;

public class BinarySearch {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size = sc.nextInt();
	int []a=new int[size];
	System.out.println("Enter the Element of the array");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	
	for(int j=0; j<a.length; j++) {
		for(int i=0; i<a.length-1; i++) {
			if(a[i]>a[i+1]) {
				int temp = a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
	}
	System.out.println("Enter the key element");
	int key=sc.nextInt();
	if(search(a,key)) {
		System.out.println("key is found");
	}else {
		System.out.println("key element is not found  enter the valid key");
	}
	}
public static boolean search(int b[],int key1) {
	int low=0;
	int high=b.length-1;
	while(low<=high) {
		int mid= (low+high)/2;
		if (b[mid]==key1) {
			return true;
		}
		else if (b[mid]<key1) {
			low=mid+1;
		}
		else {
			high=mid-1;
		}
	}
	return false;
}
}

