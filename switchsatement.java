package practice;

import java.util.Scanner;

public class switchsatement {
	public static void main(String[]args) {
		Scanner r=new Scanner(System.in);
		
	    //String name="day";	
	    System.out.println("Enter the day:");
		 String day=r.next();
	
	 switch(day){
	 case "monday","saturday":
	   day =" meeting at 10am";
	    break;
	 case "tuesday","thurday": 
		 day ="meetinng at 1pm";
		 break;
	 case"wednesday":	 
		 day ="meeting at 8am";
		 break;
	 case"friday":	 
	     day="meeting at 9.30pm";
		 break;
	 default:
	     day="sunday leave ";
		  
	 }
	System.out.println(day);
		
	}
	
}
