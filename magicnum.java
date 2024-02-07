package practice;

import java.util.Scanner;

public class magicnum {

	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the num:");
	int num=s1.nextInt();
	int s=0;
	int i=num;
	while(num>9) {
		while(num>0){
		int j=num%10;
		s=s+j;
		num=num/10;
		}
	num=s;
	s=0;
	}
if(num==1) {
	System.out.println("Magic number :"+i);
}else {
	System.out.println("Not magic number :"+i);
}
	}

}
