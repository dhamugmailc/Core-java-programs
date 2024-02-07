package arrays;
import java.util.Scanner;

public class evennums {
	
	public static void main(String[]args) {
		Scanner scan =new Scanner(System.in);
		//int[] size=new int[10];
		System.out.println("ENTER THE NUM:");
	    int num=scan.nextInt();
		System.out.println("The even numbers are:");

		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			//else{
			//	System.out.println("The odd numbers are :"+i);
			//}
			
		}
			
	}

}
