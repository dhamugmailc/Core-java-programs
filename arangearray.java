package arrays;

public class arangearray {
public static void main(String[] args) {
	int num[]= {1,-1,-3,4,6,5};
	int t=0;
	System.out.println("Negative to positive numbers :");
	for(int i=0;i<num.length;i++) {
		for(int j=i+1;j<num.length;j++) {
			if(num[i]>num[j]) {
				t=num[i];
				num[i]=num[j];
				num[j]=t;
			}
		}
	}System.out.print("{");
	for(int i=0;i<num.length;i++) {
	System.out.print(num[i]+",");
	}System.out.print("}");
}
}
