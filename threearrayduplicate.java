package arrays;

public class threearrayduplicate {
	public static void main(String[] args) {

int[]num= {10,11,12,18,21};
int[]num2={5,10,12,20,21,22};
int[]num3={4,10,12,20,21};
System.out.println("The common element in three sorted array :");
for(int i=0;i<num.length;i++) {
	for(int j=0;j<num2.length;j++) {
		for(int k=0;k<num3.length;k++) {
			if(num[i]==num2[j]&&num2[j]==num3[k]) {
				System.out.println(num[i]);
			}
		}
	}
}
}
}