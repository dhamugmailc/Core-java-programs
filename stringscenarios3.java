package Stringprograms;

public class stringscenarios3 {

	public static void main(String[] args) {
		String s1=new String("java");
	String s2=s1;//heap memory point //memory not  equal 
				                            // but object is equals
		s2="java";//
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
