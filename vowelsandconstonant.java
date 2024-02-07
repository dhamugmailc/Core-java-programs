package Stringprograms;

public class vowelsandconstonant{

	public static void main(String[] args){
		String s="abcdefghijklmnopqrstuvwxyz";
		int vow=0;
		int cons=0;
		for(int i=0;i<s.length();i++) {
			char n=s.charAt(i);
			if(n>='a'&&n<='z'){
				if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u') {
				    vow++;
				}
				else{
					cons++;
				}
			}
		}
		System.out.println("The number of vowels: "+vow);
		System.out.println("The number of cons: "+cons);
		System.out.println("The total num of alphebets: "+s.length());


	}

}
