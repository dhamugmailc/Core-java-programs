package collection;

import java.util.ArrayList;
import java.util.List;

public class repeatwords {
public static void main(String[] args) {
	List<String> s=new ArrayList<String>();
	 s.add("Ram, chennai, Adyar");
     s.add("Deva, Chennai, Adyar");
     s.add("Siva, Chennai, Vadapalani");
     s.add("Kishore, Kerala, Thrissur");
     s.add("Ganesh, Bangalore, Whitefield");
     s.add("Shivan, Chennai, Chrompet");
     String s1=String.join(" ",s).toLowerCase();//new method for String join
	    //System.out.println(s);
	    String[]word=s1.split(" ");
        for(int i=0;i<word.length;i++) {
        	int cnt=0;
        	for(int j=i+1;j<word.length;j++) {
        		if(word[i].equals(word[j])) {
        			cnt++;
        		}
        	}
        if(cnt==1) {
        	cnt++;
        	//System.out.println(cnt)
        	System.out.print(word[i]+" "+cnt+" ");
        }
        if(cnt<2){
        	System.out.println(word[i]);
        }
        }
        }
     }


