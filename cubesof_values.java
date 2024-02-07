package arrays;
import java.util.Scanner;
public class cubesof_values {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
            int[]num={1,2,3,4,5,6,7,8,9,10}; 
	        int[]c=new int[10];
	        for(int i=0;i<10;i++) {
	            c[i] =num[i]*num[i]*num[i]; 
	        }	        
	        System.out.println("\nnumbers\tCubes");
	        for (int i=0;i<10;i++) {
	            System.out.println(num[i]+"\t"+c[i]);
	        }
	    }
	}


