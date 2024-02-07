package arrays;

import java.util.Scanner;

public class evenfor_nterms2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("To find enter :");
		int[]num=new int[10];
		int cnt=0;
		for(int i=0;i<10;i++) {
			num[i]=s.nextInt();
		}
		System.out.println("Even nums are:");
		for(int j=0;j<num.length;j++) {
			if(num[j]%2==0) {
				System.out.println(num[j]);
			}
		}if(cnt==1) {
			
		}

	}

}
