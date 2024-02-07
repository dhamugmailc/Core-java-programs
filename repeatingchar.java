package Stringprograms;

public class repeatingchar {

	public static void main(String[] args) {
		String s="dhamodharan";
		// String s="xyzxyzyy";
	    System.out.println("Repeating character :");
	    for(int i=0;i<s.length();i++) {
	    	int ct=0;
	    	for(int j=i+1;j<s.length();j++) {
	    		if(s.charAt(i)==s.charAt(j)) {
	    			ct++;
	    		}
	    	}
	    	if(ct==1) {
	    		System.out.print(s.charAt(i));
	    	}
	    	
	    	
	    }
	}

}
