package Stringprograms;

public class ContainsOnlyLettersOrDigits {

	public static void main(String[] args) {
	String s="dhamu123";
	String ss="karthi234!";
     //s.matches("[a-zA-Z0-9]");
     System.out.println(s.matches("[a-zA-Z0-9]+"));
     System.out.println(ss.matches("[a-zA-Z0-9]+"));
	}

}
