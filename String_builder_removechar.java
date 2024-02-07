package Stringprograms;

import java.util.Scanner;

public class String_builder_removechar {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("dhamu");
		//s.append("d");
		System.out.println("before :"+s);
		System.out.println();
		System.out.println("After removed:");
		System.out.println(s.deleteCharAt(2));
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character :");
		String s1=sc.next();
		//String s1="dhamu";
		char n=sc.next().charAt(0);
		int a=0;
		int cnt=0;
		for(int i=0;i<s1.length();i++) {
			
			if(s1.charAt(i)==n){
				//System.out.println(s1);
				cnt++;
			}
		}System.out.println(cnt);*/
	}
}


