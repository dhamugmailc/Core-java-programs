package arrays;
import java.util.Scanner;
public class arraynum_reverse {

	public static void main(String[] args) {
        //Scanner s=new Scanner(System.in);
      // System.out.println("enter the num:");
		//int num[]=new int[5];
		// int n=s.nextInt();
        //int i=num.length-1;
		int num[]= {2,4,6,8,10};
		System.out.println("Reverse of this array :");
		for(int i=num.length-1;i>=0;i--) 
		{
			System.out.print(num[i]+",");
			
		}

	}

}
