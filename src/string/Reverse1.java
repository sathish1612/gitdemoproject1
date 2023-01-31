package string;

public class Reverse1 {
public static void main(String[] args) {
	String v = "vinith";
	char[] s = v.toCharArray();
	String m = "";
	for(int i=0; i<v.length();i++) {
		m= s[i]+m;
	}
	System.out.println(m);
}
}
