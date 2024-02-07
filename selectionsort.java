package arrays;

public class selectionsort {
	
	    public static void main(String[] args) {
	        int[]num = {21,45,-11,18,51,32};
	        //  selection the array length using this loop
            System.out.println("selection sorted array :");

	        for (int i = 0; i < num.length ; i++) {
	            int index = i;
	            for (int j = i + 1;j < num.length;j++) {
	                if (num[j] < num[index]) {
	                    index = j;
	                }
	            }
	                   
	            int temp = num[i];
	            num[i] = num[index];
	            num[index] = temp;
	            System.out.print(num[i]+",");
	           
	        }

	       // System.out.print(arr[m]+",");
	      
	    }

	    
	    
	}


