package practice;

import java.util.Scanner;

public class sumofnums extends Exception {
	public static void main(String[]args){
	  Scanner scan=new Scanner(System.in);
	  System.out.println("ENTER THE SUBJECT MARKS :");
	 try { int s1=scan.nextInt();
	  int s2=scan.nextInt();
	  float s3=scan.nextFloat();
	  int s4=scan.nextInt();
	  float s5=scan.nextFloat();
	  
	  /*int s1=90;
        int s2=82;
        float s3=80.10f;
        int s4=74;
        float s5=94.50f;*/
	 
    
  float t=(s1+s2+s3+s4+s5);
  System.out.println("TOTAL MARKS:"+t);
  System.out.println("AVERAGE :"+t/5);
	 }catch(Exception w) {
		 System.out.println("enter crt");
	 }
	 catch(NullPointerException e) {
		 System.out.println("re");
	 }
}
}
