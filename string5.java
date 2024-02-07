package Stringprograms;

public class string5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String ("java");
				String s2=s1;
				s1="python";
			     s2="python";//whenever create string literal, existing
				                  //         literal is present or not
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
