package collection;

import java.util.EnumSet;

public class Enumset {
	
	    enum Number {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

	    public static void main(String[] args) {
	       
	        EnumSet<Number> d = EnumSet.of(Number.SATURDAY,Number.SUNDAY);
	   	        d.add(Number.FRIDAY);
       	        for (Number d1 : d) {
	            System.out.println(d1);
	        }
	    }
	}


