package Stringprograms;

import java.util.Scanner;

public class name_price_quantity {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("to list out:");
		int total=0;
		int m=0;
		//System.out.println("name\t\tprice\t\tquantity\t\tprice*quantity");
for(int i=1;i<=3;i++) {
	System.out.println("product name:");
	String n=s.next();
	System.out.println("price:");
	int p=s.nextInt();
	System.out.println("quantity:");
	int q=s.nextInt();
	m=p*q;
	//System.out.println(m);
	total+=m;
	
   }
System.out.println("Total cost of all products :"+total);

	}

}
