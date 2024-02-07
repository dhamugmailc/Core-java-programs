package arrays;
import java.util.Scanner;
public class sum_of_index_pairs{

	public static void main(String[] args){
		int[]a={1,2,3,4,5,6,7,8,9};
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value:");
		int n=s.nextInt();
		System.out.println("index of that value :");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==n) {
					System.out.println("("+a[i]+","+a[j]+")");
		    }
		  }
		}
	 }
  }
