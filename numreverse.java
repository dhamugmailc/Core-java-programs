package practice;

import java.util.Scanner;

public class numreverse {

	public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the num");
     int num=sc.nextInt();
     int i=0;
     while(num>0) {
    	i=i*10 + num%10;//0*10+1234%10=0+4//in this modulo will give reminder only.
    	num= num / 10;  //using this divide the number 4 will eliminate ,i.e it gives only quotient as 123.
    }
     System.out.println(i);
	}

}
