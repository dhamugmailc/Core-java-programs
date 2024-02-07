package Stringprograms;

public class nonrepeat {

	public static void main(String[] args) {
    String s="tech tricks";
    System.out.println("Non repeating character :");
    for(int i=0;i<s.length();i++) {
    	int ct=0;
    	for(int j=i;j<s.length();j++) {
    		if(s.charAt(i)==s.charAt(j)) {
    			ct++;
    		}
    	}
    	if(ct==2) {
    		System.out.print(s.charAt(i));
    	break;
    	}
    	
    	
    }
	}

}
