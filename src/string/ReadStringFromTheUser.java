package string;

import java.util.Scanner;

public class ReadStringFromTheUser {
public static void main(String[] args) {
	System.out.println("Enter the String");
	Scanner sc = new Scanner(System.in);
	String s1 = sc.nextLine();
	System.out.println("Enter the String");
	String s2 = sc.next();
	System.out.println(s1);
	System.out.println(s2);
}
}
