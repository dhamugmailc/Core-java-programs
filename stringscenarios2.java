package Stringprograms;
public class stringscenarios2 {
	public static void main(String[] args) {
	String s1=new String("java");
	String s2=s1;
	    if(s1==s2) {
			System.out.println("equal(==)");
		}
		else {
			System.out.println("not equal(==)");
		}
		if(s1.equals(s2)) {
			System.out.println("equals(=)");
		}
		else {
			System.out.println("not equals(=)");}
}
}
