package Stringprograms;

public class eleminatefrequentstring {

	public static void main(String[] args) {
     String s="dhamodharn";
     char[]s1=s.toCharArray();
     //int ct=0;
     for(int i=0;i<s1.length;i++) {
    	 if(s1[i]!='0'&&s1[i]!=' ') {
    	 for(int j=i+1;j<s1.length;j++) {
    		 if(s1[i]==s1[j]) {
    		 s1[j]='0';
     }
	}
    	 System.out.print(s1[i]);
     }

}
}
}
