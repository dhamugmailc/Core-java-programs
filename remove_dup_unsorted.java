package arrays;

public class remove_dup_unsorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int a[]= {12,10,12,8,15,10,20,30};
		System.out.println("The remaining elements after elimination:");
		for(int i=0;i<a.length;i++) {
			int cnt=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					cnt++;
				}
			}
			if(cnt==1) {
				System.out.print(""+a[i]+",");
			}
		}
    
  
		}

}
