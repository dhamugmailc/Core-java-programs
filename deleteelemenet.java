package arrays;

import java.util.Scanner;

public class deleteelemenet {
public static void main(String[] args) {
	int[]num= {1,20,4,5,8};
	int del=0;
	//int n=4;

	Scanner s=new Scanner(System.in);
	System.out.println("Enter the index to delete :");
	del=s.nextInt();
	for(int i=del;i<num.length-1;i++) {
		num[i]=num[i+1];	
			}
	System.out.println("The remaining array :");
	for(int i=0;i<num.length-1;i++) {
		System.out.print(num[i]+",");
		}
	
		
		

}
}

