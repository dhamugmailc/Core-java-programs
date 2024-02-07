package arrays;

public class withoutduplicate {
	
	    public static void main(String[] args) {
	        int[]num ={12,34,10,45,13};
	        int[]num2={12,45,24,38,10};
	        int[]num3={10,12,45,90,70};
	        int uniqueCount = 1;
	       int[] arr = new int[num.length+num2.length+num3.length];
	       for(int i=0;i<num.length;i++) {
	    	   arr[i]=num[i];
	       }
	       for(int i=0;i<num2.length;i++) {
	    	   arr[i]=num2[i];
	       }
	       for(int i=0;i<num3.length;i++) {
	    	   arr[i]=num3[i];
	       }
	       

	        // Iterate through the original array
	        for (int i = 0; i < arr.length-1; i++) {
	            boolean Duplicate = false;

	            // Check if the element already exists in the unique array
	            for (int j = 0; j <uniqueCount; j++) {
	                if (arr[i] == arr[j]) {
	                    Duplicate = true;
	                    break;
	                }
	            }

	            // If it's not a duplicate, add it to the unique array
	            if (!Duplicate) {
	            	arr[uniqueCount] = arr[i];
	                uniqueCount++;
	            }
	        }

	        // Print the unique elements
	        System.out.println("Unique elements in the array:");
	        for (int i = 0; i < uniqueCount; i++) {
	            System.out.println(arr[i]);
	        }
	        
	    }
	}


