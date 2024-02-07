package arrays;

import java.util.Scanner;

public class studentmarks {

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String[]students= new String[5];
	int []rollno=new int[5];
	int [][] marks=new int[3][5];
	int total=0;
	int avg=0;
	for(int i=0;i<5;i++) {
		//System.out.println("Enter the student"+(i+1)+" name:");
	   // students[i]=s.next();
	    System.out.println("Enter rollno :");
	    rollno[i]=s.nextInt();
	    for(int j=0;j<3;j++) {
	    	System.out.println("subject "+(j+1)+" mark ");
	    	marks[i][j]=s.nextInt();
	    }    
	}for(int i=0;i<5;i++) {
		for(int j=0;j<3;j++) {
			total+=marks[i][j];	
		}
	System.out.println(total);
	}
	
}

}
