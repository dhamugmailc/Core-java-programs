package Stringprograms;

import java.util.Scanner;

public class gradeofstu {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=4;
		String hgs="";
		int hg=0;
		for(int i=1;i<=num;i++) {
			System.out.println("enter student "+i+" name:");
			String n=s.next();
			System.out.println("enter mark:");
			int g=s.nextInt();
			if(g>hg) {
				hg=g;
				hgs=n;
			}
		}System.out.println(hgs+"=> he scored highest grade");

	}

}
