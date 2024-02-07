package collection;
import java.util.*;
public class array_sumpairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]={1,2,3,4,5,6,7,8,9};
    //int sum=10;
   // int cnt=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the sum number to find pair :");
    int n=s.nextInt();
    int i=0;
    int j=a.length-1;
    while(i<j){
         if(a[i]+a[j]==n) {
        	//cnt++;
        	 System.out.println("pair("+a[i]+","+a[j]+")");
        	i++;
        	j--;
           }
         else if (a[i]+a[j]<n) {
        	 i++;
    	}else {
    		j--;
    	}
    }
  }

}
