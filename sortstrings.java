package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class sortstrings {

	public static void main(String[] args) {
		String s="I learn quick easily";
		String[] s1=s.split(" ");
	
		Arrays.sort(s1,Comparator.comparingInt(String::length));
		for(String ss:s1) {
		System.out.print(" "+ss);
		}
	}

}
