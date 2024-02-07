package Stringprograms;

public class remove_space_sententese{

	public static void main(String[] args){
		String s="Remove   unwanted   spaces from   sentence";
		System.out.println("Before:");
		System.out.println(s);
		System.out.println("After :");
		System.out.println(s.replaceAll("   "," "));
		//String s1=s;
		//System.out.println(s.strip()s1.replaceAll("   "," "));
	}
}
