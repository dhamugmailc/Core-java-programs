package Stringprograms;

import java.util.Scanner;
public class repeat_words{
	public static void main(String[] args){
		String s="big game big player game chager player ";
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the sentence :");
        //String s=sc.nextLine();
        s.toLowerCase();
        
        String[]word=s.split(" ");
        for(int i=0;i<word.length;i++){
        	int cnt=0;
        	for(int j=i;j<word.length;j++){
        		if(word[i].equals(word[j])){
        			cnt++;
        			//System.out.println(word[i]);
        		}
        	}
        if(cnt>1){
           System.out.println(word[i]);	
       }
        }
	}

}
