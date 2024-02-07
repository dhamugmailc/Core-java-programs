package arrays;

public class crossmatrix {

	public static void main(String[] args) {
		int num[][]={{2,3,4},
		             {6,7,8},
		             {3,5,2}};
		int sum=0,sum2=0;
       for(int i=0;i<num.length;i++) {
    	   
    	for(int j=0;j<num.length;j++) {  
    		   
    	   if (i==j) {
    		   System.out.print(num[i][j]+" ");
    		   //System.out.println();
    		   sum+=num[i][j];
    	      }
    	   if(i+j==2) {
    		 sum2+=num[i][j];
    		  
    	     }
          }
    	  
	}
       System.out.println("sum of diagonal 1 :"+sum);
       System.out.println("sum of diagonal 2 :"+sum2);
       
	}

}
