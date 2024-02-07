package arrays;

public class removedup2 {

	public static void main(String[] args) {
		int a[]= {12,23,34,12,45,12};
      System.out.println("without duplicate:");
		for(int i=0;i<a.length;i++) {
			 int cnt=0;
			for(int j=0;j<a.length;j++) {
				if (a[i]==a[j]) {
					cnt++;
				}
			}
			if(cnt==1) {
				System.out.print(" "+a[i]);
		}
		}
	}

}
