package arrays;

public class transposematrix {
	public static void main(String[] args) {
		
		int num[][]={{12,23,43},{4,5,19},{8,7,9}};
		//int sum=0;
		System.out.println("Normal matrix :");
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
				System.out.print(num[i][j]+" ");
				
			}
			System.out.println();
			
			
		}
		System.out.println("---------------------");
		
        System.out.println("Transpose of matrix :");
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
				System.out.print(num[j][i]+" ");
				
			}
		
			System.out.println();
			//System.out.println();
			//System.out.println("");
			//sum=0;
		
	    }
}
}
