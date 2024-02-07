package arrays;

public class move_all_0 {

	public static void main(String[] args) {
		int a[]= {0,1,0,3,12};
		
		System.out.println("Input:");
		System.out.print("{");
		for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+",");
		}
		System.out.println("}");
		
		System.out.println("output:");
		System.out.print("{");
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				//b=a[i];
				System.out.print(a[i]+",");
			}
		}for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				System.out.print(a[i]+",");
			}
		}System.out.println("}");
	}
}
