package arrays;

public class selectionsortalgoritym {

	public static void main(String[] args) {
	
int n[]= {6,5,4,3,2,1};

for(int i=1;i<n.length-1;i++	) {
	for(int j=1;j<n.length-i-1;j++) {

	if(n[j]>n[j+1]) {
		int arr=n[j];
		n[j]=n[j+1];
		n[j+1]=arr;
		
	System.out.println(i);
}
}
}
}
}
