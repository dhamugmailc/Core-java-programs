package Stringprograms;

public class remove_dup_lenghtit {

	public static void main(String[] args) {
    String ss="xyzxyzyy";
   // char[]s=ss.toCharArray();
	
	for(int i=0;i<ss.length();i++) {
		int cnt=0;
		for(int j=i;j<ss.length();j++) {
			if(ss.charAt(i)==ss.charAt(j)) {
				cnt++;
			}
		}if(cnt==1) {
			System.out.print (ss.charAt(i));
		}
	}
	//System.out.println(n);
	}

}
