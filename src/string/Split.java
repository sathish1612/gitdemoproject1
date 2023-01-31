package string;

public class Split {
public static void main(String[] args) {
	String s ="java,manual,sql,selenium,testng,maven";
	String[] s1 = s.split(",");
	for (String i : s1) {
		System.out.println(i);
	}
}
}
