package practice;

import java.util.Scanner;

public class daysinmonth {
	public static void main(String args[]) {
	Scanner r=new Scanner(System.in);
	System.out.println("ENTER THE YEAR :");
	int year=r.nextInt();
	
  System.out.println("Enter the month:");
	int month=r.nextInt();
	 int days=0;

 switch(month){
 case 1,3,5,7,8,10,12:
    days =31;
// System.out.print("Days in this month is ");
    break;
 case 2:
	 days =(year%4==0&&year%10!=0||year%400==0)?29:28;
	 break;
 case 4,6,9,11:	 
     days=30;
	 break;
 
 
 }
System.out.println(days);
	
}


}
