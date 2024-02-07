package practice;

import java.util.Scanner;

public class Arrays {
public static void main(String[]args) {
	//int []num=new int[8];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the num:");
	int []nums={1,2,3,4,5,6,7,8};
	int n=sc.nextInt();
	int index=0;
	for(int i=0;i<nums.length;i++) {
		if(nums[i]==n) {
		index=i;
		}
	}
	System.out.println("index:"+index);
}
}
