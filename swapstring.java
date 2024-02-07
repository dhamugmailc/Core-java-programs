package Stringprograms;

public class swapstring {

	public static void main(String[] args) {
    String dhamu="good";
    String arun="average";
    System.out.println("Before swapping :");
    System.out.println("1.dhamu is '"+dhamu+"' student");
    System.out.println("2.arun is '"+arun+"' student");
    System.out.println("*********************");
    dhamu=dhamu+arun;
    //System.out.println(dhamu);
    System.out.println("After swapping :");
    arun=dhamu.substring(0,4);
    dhamu=dhamu.substring(4, 11);
    System.out.println("1.dhamu is '"+dhamu+"' student");
    System.out.println("2.arun is '"+arun+"' student");
	}

}
