package arrays;

public class remove_duplicate_and_print {

	public static void main(String[] args) {
		int a[]= {12,23,34,12,45,12};
		int b[]= {12,34,45,67};
		int c[]=new int[a.length+b.length];
		System.out.println("After removed the duplicate elemets :");
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[i+a.length]=b[i]; 
			}
		for(int i=0;i<c.length;i++) {
			int cnt=0;
			for(int j=0;j<c.length;j++) {
				if(c[i]==c[j]) {
					cnt++;
				}
			}
		     
			if(cnt==1) {
				System.out.print(c[i]+" ");
			}
		}
	}
}


