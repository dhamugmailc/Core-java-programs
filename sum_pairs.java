package arrays;

import java.util.Scanner;

public class sum_pairs {

	public static void main(String[] args) {
		//int[]a= {2,3,4,1,5,7,6};
		 int a[]={1,2,3,4,5,6,7,8,9};
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value:");
		int n=s.nextInt();
		int i=0;
		int j=a.length-1;
		while(i<j) {
			if(a[i]+a[j]==n) {
	        	 System.out.println("pair("+a[i]+","+a[j]+")");
				i++;
				j--;
			}
			else if(a[i]+a[j]<n) {
				i++;
			}
			else {
				j--;
			}
		}
		
		

	}

}
