package practice;
import java.util.Scanner;
public class down {
	


	    		// Main driver method
	    		public static void main(String[] args)
	    		{
	    			// Nested 2 for loops for iteration over the matrix

	    			// Outer loop for rows
	    			int rows = 7;
	    			for (int a = rows - 1; a >= 0; a--) {

	    				// Inner loop for columns
	    				for (int b = 0; b <= a; b++) {

	    					// Prints star and space
	    					System.out.print("*"
	    									+ " ");
	    				}

	    				// By now we are done with single row so new
	    				// line
	    				System.out.println();
	    			}
	    		}
	    	}



