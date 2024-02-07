package arrays;

public class mergearray {
public static void main(String[] args) {
	int A[]= {1,2,3,4};
	int B[]= {5,6,7,8};
	int C[]=new int[A.length + B.length];
	//int ct=0;
	for(int i=0;i<A.length;i++) {
		C[i]=A[i];
		
	}System.out.print(" two array :");
	for(int i=0;i<B.length;i++) {
		C[i+A.length]=B[i];
		
	}	for(int i=0;i<C.length;i++) {
		System.out.print(C[i]+",");
	}

}
}

