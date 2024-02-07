package Stringprograms;

public class string9 {

	public static void main(String[] args) {
		
		String s1=new String ("java");
			String s2="java";
		  //heap memory
		//string constant pool				
						
			s1=null;//memory nulify
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
