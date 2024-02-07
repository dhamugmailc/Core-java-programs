package Stringprograms;

public class occurance_character {

	public static void main(String[] args) {
    // StringBuffer s=new StringBuffer("dhamodharan");
	     String s="dhamodharan";

     int remaining=s.replace("a","").length();
     
     //System.out.println(remaining);
     int balcount=s.length()-remaining;
     
     System.out.println("The count of this character is: "+balcount+"");
     
	}

}
