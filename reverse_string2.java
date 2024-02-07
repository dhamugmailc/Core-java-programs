package Stringprograms;

public class reverse_string2 {

	public static void main(String[] args) {
    String s="learn quickly";
    String s1="i easily";
    String a="";
    String s2="";
    String[]words=s.split(" ");
    for(int i=words.length-1;i>=0;i--) {
    	a=words[i];
    	
		//System.out.print(words[i]+" ");
    	System.out.print(s2=s1.substring(0,1)+" "+a+" "+s1.substring(2));
    	//System.out.print(s2.substring(0,8));

    }   
   
	}

}
