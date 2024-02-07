package Stringprograms;

public class each_character_occurance {

	public static void main(String[] args) {
    String s="dhamodharan";
   // String s1=s.substring();
    
    for(int i=0;i<s.length();i++) {
    	int ct=0;
    	for(int j=0;j<s.length();j++) {
    		if(s.charAt(i)==s.charAt(j)) {
    			ct++;
    			//int k=s.charAt(j);
    			//s.charAt(j)
    			//k=0;
    		}
    	}//if(ct==1) {
    	System.out.println(s.charAt(i)+" is occurs :"+ct);
    }
	}
	}

