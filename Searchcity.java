package arrays;

import java.util.Scanner;

public class Searchcity {

	public static void main(String[] args) {
		String[]city=new String[10];
		int []std=new int[10];
		Scanner s=new Scanner(System.in);
		try{for(int i=0;i<4;i++) {
			System.out.println("enter city "+(i+1)+" name");
			city[i]=s.next();
			System.out.println("STD of above city:");
			std[i]=s.nextInt();
			s.nextLine();
		}
		System.out.println("To search:");
		String n=s.next();
		 boolean f=false;
		for(int i=0;i<4;i++) {
			if(n.equalsIgnoreCase(city[i])) {
				System.out.println("Search successful");
				System.out.println("city: "+city[i]+"-"+std[i]);
			f=true;
			}
			
		}if(!f){
			System.out.println("Search unsuccessful ,no such city in list");
		}}catch(Exception e) {
			System.out.println("*Enter the input correctly* ");

	}
	}
}

