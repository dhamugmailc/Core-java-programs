package Stringprograms;
import java.util.Scanner;
public class Strcompare3 {

	public static void main(String[] args) {
		

		        Scanner s = new Scanner(System.in);
		        System.out.println("Enter two Strings to compare:");
		        String s1 = s.next();
		        String s2 = s.next();
		        boolean notequal = true;

		        if (s1.length() == s2.length()) {
		            for (int i = 0; i < s1.length(); i++) {
		                if (s1.charAt(i) == s2.charAt(i)) {
		                    notequal = false;
		                    break; // Exit the loop as soon as unequal characters are found
		                }
		            }

		            if (notequal) {
		                System.out.println("Content of Two Strings are equal.");
		            } else {
		                System.out.println("Not equal");
		            }
		        } else {
		            System.out.println("The length of two Strings is not equal, please check the length.");
		        }
		    }
		}
