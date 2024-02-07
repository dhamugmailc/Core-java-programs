package practice;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		        int n = 5; // Change this value to adjust the height of the pattern

		        // Upper part of the pattern
		        for (int i = 1; i<=n; i++) {
		            for (int j =1; j<=i; j++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }

		        // Lower part of the pattern
		       /* for (int i = 5 - 1; i >= 1; i--) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }*/
		    	}

}
