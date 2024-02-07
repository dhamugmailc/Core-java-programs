package Stringprograms;

public class divide_5equalstring {

	public static void main(String[] args) {
    String s="abcdefghijklmnopqrstuvwxy";
    int n=5;

    if(s.length()%n==0) {
    System.out.println("The string divided into 5 and they are:");
    int startIndex=0;
    int endIndex=n;
   for (int i=0;i<n;i++) {
	   
        //String s1 = s.substring(startIndex, endIndex);
        System.out.println(s.substring(startIndex, endIndex));
       // for(ss:s1)
        //System.out.println(s1);
        startIndex=endIndex;
         endIndex+= n;
         
    }
    }else{
   System.out.println("cannot divide the string");
	}
}
}
