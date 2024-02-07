package Stringprograms;

public class isemptyisblank {

	public static void main(String[] args) {
      String s=" ";
      System.out.println("Comparision 1:");
          System.out.println("isEmpty :"+s.isEmpty());
          System.out.println("isBlank :"+s.isBlank());
          System.out.println("*************************");
          
      String sp="  ";
      System.out.println("Comparision 2:");
    	  System.out.println("isEmpty :"+sp.isEmpty());
    	  System.out.println("isBlank :"+sp.isBlank());
          System.out.println("*************************");
  
      String ch="Task Done";
      System.out.println("Comparision 3:");
          System.out.println("isEmpty :"+ch.isEmpty());
          System.out.println("isBlank :"+ch.isBlank());
          System.out.println("*************************");
  
	}
	}


