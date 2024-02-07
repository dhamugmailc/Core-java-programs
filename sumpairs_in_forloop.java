package collection;

import java.util.Scanner;

public class sumpairs_in_forloop {

	public static void main(String[] args) {
	int a[]={2,3,4,1,5,7,6};
	Scanner s=new Scanner(System.in);
	System.out.println("enter the value:");
	int n=s.nextInt();
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]+a[j]==n) {
				System.out.println("("+a[i]+","+a[j]+")");
			}
		}
	}
	}

}
