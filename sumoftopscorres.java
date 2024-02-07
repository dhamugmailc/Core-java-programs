package arrays;

public class sumoftopscorres {
public static void main(String[]args) {
	int N=4;
	int k=2;
	int A[]= {4,1,2,5};
	 int max1 = Integer.MIN_VALUE;
	 int max2=Integer.MIN_VALUE;
for(int a:A) {
	if(a>max1) {
		max2=max1;
		max1=a;
		
	}
}System.out.println(max1+"+"+max2+" = "+(max1+max2));
}
}
