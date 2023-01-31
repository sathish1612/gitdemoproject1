package string;

public class VinthSplit {
public static void main(String[] args) {
	String s="sathish kumar";
	String[] v = s.split("sathish ");
	for (int i=0 ; i<v.length;i++) {
		System.out.println(v[i]);
	}
}
}
