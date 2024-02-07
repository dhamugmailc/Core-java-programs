package Stringprograms;

public class reversewords_instring {

	public static void main(String[] args) {
		String ss="i learn qiuck easily";
		String[] s1=ss.split(" ");
		for(String s:s1) {
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i)+"");
		  }
		System.out.print(" ");
		}
	}
}
