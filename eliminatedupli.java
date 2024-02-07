package arrays;

public class eliminatedupli {
public static void main(String[] args) {
	int num[]={2,7,2,4,5,4};
	int n=0;
	System.out.println("The elements without duplicate :");
	for(int i=0;i<num.length;i++) {
		for(int j=i+1;j<num.length;j++) {
		if(num[i]==num[j]) {
			//n=num[i];
			System.out.print(num[i]+",");
			
		}
		
		

}
}System.out.println(n);
}
}

