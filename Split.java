package Stringprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Split {

	public static void main(String[] args) {
		String s="A|B|C|D";
		//String s="hello world";
		//StringBuilder s1=new StringBuilder("A|B|C|D");
		String []s1=s.split("\\|");
	    for(String s2:s1 ) {
	    	System.out.println(s2);
	    }

	}

}
