package practice;
import java.util.Scanner;
//import java.util.*;
public class array {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		float marks[]=new float[6];
		float total=0,avg=0;
		for(int i=0;i<6 ;i++) {
		System.out.println("Enter marks of subject"+(1+i)+" :" );	
		 int n = 0;
		marks[n]=sc.nextFloat();
		 total=total+marks[n];
		}
		avg=total/6;
		System.out.println(total);
		System.out.println(avg);
		System.out.println(" Grade is shown bellow :");
		System.out.println(" ----------------------");
		if ((avg<35)) {
			System.out.println(" Grade is C he is Poor student ");
			
		}
		else if((avg<=75)&&(avg>35)){
			
			System.out.println(" Grade is B he is Average student");
			
		}
		else if((avg>75)) {
			System.out.println(" Grade is A he is Good Student ");
		}
	}

}
	