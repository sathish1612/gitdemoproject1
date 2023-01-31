package string;

public class StringToArray {
public static void main(String[] args) {
	String d = "darshan";
	char[] s = d.toCharArray();
	for (int i=0;i<s.length;i++) {
		System.out.println(s[i]);
	}
	System.out.println(d.toUpperCase()); 
	System.out.println(d.concat("sathish"));
	System.out.println(d.substring(4));
	System.out.println(d.indexOf('s'));
}
}
