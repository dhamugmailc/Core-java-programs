package Stringprograms;

public class reversewords {

	public static void main(String[] args) {
		String s1="simple logic!";
		String[]words = s1.split(" "); // Split by space
       System.out.println("Words in the string:");
      // System.out.println(words);
       for (int i=0;i<words.length;i++) {
           System.out.print(words[i]+" ");
       }
       System.out.println();
       
        System.out.println("Word reversed in the string:");
        for(int i=words.length-1;i>=0;i--) {
        	System.out.print(words[i]+" ");
        }
	}

}
