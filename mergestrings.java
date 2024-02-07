package Stringprograms;

public class mergestrings {
public static void main(String[] args) {
	String ar1[]={"dhamu","arun","karthik"};
	String ar2[]= {"dharun","siva","krish"};
    String ar3[]=new String [ar1.length+ar2.length];
    for(int i=0;i<ar1.length;i++) {
    	ar3[i]=ar1[i];
    }
    for(int i=0;i<ar2.length;i++){
    	ar3[ar1.length+i]=ar2[i];
    	}
    for(int i=0;i<ar3.length;i++) {
    	System.out.println(ar3[i]);
    }
    
}

}
