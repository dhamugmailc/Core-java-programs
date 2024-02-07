package Stringprograms;

import java.util.Scanner;

public class removetargetchar {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("to remove enter the num:");
		char n=s1.next().charAt(0);
		String s="dhamoharan";
		for(int i=0;i<s.length();i++) {
			int cnt=0;
				if(s.charAt(i)!=n) {
					System.out.print(s.charAt(i));
				}
			}			
		}

}
