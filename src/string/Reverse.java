package string;

public class Reverse {
public static void main(String[] args) {
	String v = "vinith";
	String s = "";
	for (int i =0;i<v.length();i++) {
		//s=s+v.charAt(i);
		s=v.charAt(i)+s;
	}
	System.out.println(s);
}
}
