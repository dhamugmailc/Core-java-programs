package collection;

public class frequency_word {

	public static void main(String[] args) {
		String s1="best items in category are samsung, Lenovo, samsung items are cool";
		String[] s=s1.split(" ");
		int cnt=0;
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s.length;j++) {
				if(s[i].equals(s[j])) {
					cnt++;
					//System.out.println(s[i]);
				//}
			}
			
		}if(cnt>1){
			System.out.println(s[i]+cnt);
		}

	}

	}}
