package arrays;

public class duplicatevalue {

	public static void main(String[] args) {
		int A[]={12,23,34,12,45,12};
		int B[]={12,34,45,67};
		int C[]=new int[A.length + B.length];
		for(int i=0;i<A.length;i++) {
			C[i]=A[i];
		}System.out.print("Sum of two array :");
		for(int i=0;i<B.length;i++) {
			C[i+A.length]=B[i];
			int sum=+A[i]+B[i];
    		System.out.print(sum+",");
		}	
		System.out.println();

		System.out.println();
		int n=0;
		int m=0;
		int d=0;
		
        for (int i=0;i<A.length;i++) {
        	for(int j=i+1;j<A.length;j++) {
        		if(A[i]==A[j]) {
        		    n=A[i];
        		  }
        		
        		}
        }
        System.out.println("Common in A array :"+n);
        System.out.println();
        		for (int i=0;i<B.length;i++) {
                	for(int j=i+1;j<B.length;j++) {
                		if(B[i]==B[j]) {
                		 m=B[i];
                		}
                	}
        		}
        		System.out.println("Duplicate in A :"+n);
        		System.out.println();
        		System.out.println("No Duplicate  in B array :"+m);
        		System.out.println();
    			System.out.print("Common in two array :");

        		for(int i=0;i<C.length;i++) {
        			int cnt=0;
        			for(int j=i+1;j<C.length;j++) {
                		if(C[i]==C[j]) {
                	      cnt++;
                		//d=C[i];
                			//break;
                		}	
        			}if(cnt==1) {
        			System.out.print(C[i]+",");
        			}
        			
        		}
        		/*for(int i=0;i<C.length;i++) {
        			
        		int cnt=0;
        		for(int j =0;j<C.length;j++) {
    				if(C[i]==C[j]) {
    					cnt++;
    				}	
    			}
    			if(cnt==1) {
    				System.out.println(C[i]);
    			}
        		//System.out.println(d);
	            }*/
}
}
        
	

	


