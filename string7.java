package Stringprograms;

public class string7 {

	public static void main(String[] args) {
		String s1=new String ("java");
		String s2=s1;
		s1=new String ("python");//heap memory
		s2=new String("python");//scp
		//s3=new String (s1);
		    if(s1==s2){
				System.out.println("equal(==)");
			}
			else{
				System.out.println("not equal(==)");
			}
			if(s1.equals(s2)){
				System.out.println("equals(=)");
			}
			else{
				System.out.println("not equals(=)");}
	}

}
