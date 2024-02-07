package arrays;

import java.util.Arrays;

public class Stringsorting {

	public static void main(String[] args) {
		String s="java";
		char[] a=s.toCharArray();
        char b=0;
        System.out.println("In alphabetical order: ");
       /* System.out.println("without using  sort:");
        for(int i=0;i<a.length;i++) {
        	for(int j=i+1;j<a.length;j++) {
        		if(a[i]>a[j]) {
        			b=a[i];
        			a[i]=a[j];
        			a[j]=b;
        		}
        	}
        	System.out.print(a[i]);
        }*/
        System.out.println("with using sort method :");
        Arrays.sort(a);
        System.out.println(a);
        //System.out.print(Arrays.sort(a));
	}

}
