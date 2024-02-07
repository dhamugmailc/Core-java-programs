package arrays;

import java.util.Scanner;

public class m {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
	        String[]st=new String[5];
	        int[]roll=new int[5];
	        int[][]marks=new int[5][3];
	        int avg=0;

	        for (int i=0;i<5;i++) {
	            System.out.println("Enter student name:");
	            st[i]=s.next();
	            System.out.println("Enter roll no:");
	            roll[i]=s.nextInt();
	            for (int j=0;j<3;j++) {
	                System.out.println("Enter the "+(j+1)+" subject mark");
	                marks[i][j]=s.nextInt();
	              }
	        }

	        System.out.println("\nName\tRollno\tTotal\tAverage");
	        for (int i=0;i<5;i++) {
	            int total=0;
	            for(int j=0;j<3;j++) {
	                total+=marks[i][j];
	            }
	            avg=total/3;
	            System.out.println(st[i]+"\t"+roll[i]+"\t"+total+"\t"+avg);
	        }
	    }

}
