package practice;

import java.io.IOException;

public class try_catch extends Exception{

	public static void main(String[] args) {
		try {
		    int a=2;
		    int b=0;
		    int c=a/b;
		} catch (ArithmeticException e) {
		   System.out.println("enter crt ");
		} catch (NullPointerException e) {
		    System.out.println("dont give nullvalues");
		} catch (Exception e) {
		    
		}

	}

}
