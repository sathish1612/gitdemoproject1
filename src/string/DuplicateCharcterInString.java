package string;

public class DuplicateCharcterInString {
 public static void main(String[] args) {
	String s = "sathishkumar";
	for(int i=0;i<s.length()-1;i++) {
		for(int j=1;j<s.length();j++) {
			if (s.charAt(i)==s.charAt(j)) {
				System.out.println(s.charAt(i));
				
			}
			
		}
	}
}
}
