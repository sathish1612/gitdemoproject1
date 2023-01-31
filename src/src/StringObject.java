package src;

public class StringObject {
public static void main(String[] args) {
	String s=new String("Hello");
	String s2= new String("Hello");
	System.out.println(s==s2);
	System.out.println(s.equals(s2));
	String s3="sathish";
	s3="kumar";
	System.out.println(s3);
}
}
