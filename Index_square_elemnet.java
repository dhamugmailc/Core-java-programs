package arrays;

public class Index_square_elemnet {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		System.out.println("element\tindex\tsquare");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+"\t"+i+"\t"+(a[i]*a[i]));
		}

	}

}
