package Stringprograms;

public class togglestring {

	public static void main(String[] args) {
		
     String s="ApPlE";
     char c[]=s.toCharArray();
     for (int i=0;i<c.length;i++) {
         char s1=c[i];

         if (Character.isUpperCase(s1)) {
             c[i]=Character.toLowerCase(s1);
         } 
         else if(Character.isLowerCase(s1)) {
             c[i]=Character.toUpperCase(s1);
         }
         System.out.print(c[i]);
	}
  
     }
}
	
	
	

//}
