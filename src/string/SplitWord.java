package string;

import java.util.Scanner;

public class SplitWord {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String");
	String s1 = s.nextLine();
	String[] str = s1.split(" ");
	System.out.println("Enter the String");
	String str1 = s.next();
	System.out.println(s1.length());
	System.out.println(s1.concat(" I LOVE YOU"));
	System.out.println(s1.charAt(1));
	System.out.println(s1.toUpperCase());
	System.out.println(new String());
	//String ch = new String(str)
	
}
}
