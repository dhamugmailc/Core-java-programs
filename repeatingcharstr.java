package Stringprograms;

public class repeatingcharstr {

	public static void main(String[] args) {
		 String s="dhddamodharaan";
	     char[]s1=s.toCharArray();
	     int cnt=0;
	     char r='0';
		//System.out.println("Most frequent character in the string :");
	     for(int i=0;i<s.length();i++) {
	 	    int ct=0;
	    	// if(s1[i]!='0'&&s1[i]!=' ') {
	    	 for(int j=i+1;j<s.length();j++) {
	    		 if(s1[i]==s1[j]) {
	    		ct++;
	    		//s1[j]=0;
	     }
		}//if(ct==1)
	    //	 System.out.println(s1[i]);
	if(ct>cnt) {
		r=s1[i];
		cnt=ct;
	}
	     }
	if(cnt>0) {
		System.out.println(r+"=> "+cnt+" times");
	}
		
	     }
}
//}
