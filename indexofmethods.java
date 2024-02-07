package Stringprograms;

public class indexofmethods {

	public static void main(String[] args) {
		String s1="task sun done at time";//indexoff => "done"=>  lastindexof
		String s2="task done at time";
		boolean compare=s1.startsWith(s2);
		System.out.println(compare);
		System.out.println(s1.indexOf("m"));//shows index 
		System.out.println(s1.indexOf("s",6));// manipulate the index search from starting of the string
		System.out.println(s1.lastIndexOf("done"));
		System.out.println(s1.lastIndexOf("sun",4));//we can search the char index and word index after the index (lastindex)
		
}
}
