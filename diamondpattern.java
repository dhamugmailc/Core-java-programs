package practice;
import java.util.Scanner;

public class diamondpattern {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	//int row=0;
	System.out.println("Enter the row:");
	int r=s.nextInt();
	
	for(int i=0;i<r;i++) {
		for(int j=0;j<r-i;j++) {
		System.out.print(" ");
		}
		for(int j=0;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
		for(int i=0;i<r-1;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<r-i-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
}
}
