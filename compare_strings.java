package Stringprograms;

public class compare_strings {

	public static void main(String[] args) {
    String s1="This is string task";
    String s2="This is string Task";
    	int ans=s1.compareToIgnoreCase(s2);
    	if(ans==0) {
    		System.out.println(s1);
    		System.out.println(s2);
    		System.out.println("output:");
    		System.out.println(s1+" is equal to "+s2);
    	}
	}

}
