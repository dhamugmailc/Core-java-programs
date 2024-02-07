package Stringprograms;

public class string4 {

	public static void main(String[] args) {
		String s1=new String("java");//heap memory
		String s2=s1;
		s1="python";//scp
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
