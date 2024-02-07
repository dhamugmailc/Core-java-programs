package Stringprograms;

public class cntof_words {

	public static void main(String[] args) {
		String s1="best items in category are samsung Lenovo samsung items are cool";
        String[]w=s1.split(" ");
        for(int i=0;i<w.length;i++)	 {
        	int cnt=0,a=0;
        	for(int j=0;j<w.length;j++) {
        		if(w[i].equals(w[j])) {
        			cnt++;
        		}
        		//else {
        		//	a++;
        		//}
        	}System.out.println(w[i]+" "+cnt);
        	/*if(cnt==2) {
        		System.out.println(w[i] +cnt);
        	}
        	else {
        		System.out.println(w[i]+a);
        	}*/
        }
    }

}
