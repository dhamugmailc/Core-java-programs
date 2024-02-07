	package arrays;
	
	import java.util.Scanner;
	
	public class reverse2 {
	
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("for array:");
			int[]num=new int[5]; 
			for(int i=0;i<5;i++) {
				num[i]=s.nextInt();
			}for(int j=num.length-1;j>=0;j--) {
				System.out.print(num[j]+" ");
			}
	
		}
	
	}
