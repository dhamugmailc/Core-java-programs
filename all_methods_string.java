package Stringprograms;

public class all_methods_string {

	public static void main(String[] args) {
		
		  
		        // Creating a sample string
		        String s1 = " task done";
		        
		        // 1. length() - Get the length of the string
		        int length = s1.length();
		        System.out.println("Length of the string: " + length);
		        System.out.println("********************************");
		        
		        // 2. charAt() - Get a character at a specific index
		        char charatIndex = s1.charAt(7);
		        System.out.println("Character at index 7: " + charatIndex);
		        System.out.println("********************************");

		        // 3. substring() - Get a substring
		        String substring = s1.substring(0, 5); // Get characters from index 0 to 4
		        System.out.println("Substring from index 0 to 4: " + substring);
		        System.out.println("********************************");

		        // 4. indexOf() - Find the index of a specific character or substring
		        int indexOfspace = s1.indexOf(" ");
		        System.out.println("Index of ' ' character: " + indexOfspace);
		        System.out.println("********************************");

		        // 5. replace() - Replace characters or substrings
		        String replacedString = s1.replace("done", "completed");
		        System.out.println("After replacing 'done' with 'completed': " + replacedString);
		        System.out.println("********************************");

		        // 6. toUpperCase() and toLowerCase() - Convert to upper or lower case
		        String upperCaseString = s1.toUpperCase();
		        String lowerCaseString =s1.toLowerCase();
		        System.out.println("Uppercase: " + upperCaseString);
		        System.out.println("Lowercase: " + lowerCaseString);
		        System.out.println("********************************");

		        // 7. trim() - Remove leading and trailing spaces
		        String stringWithspace = "   Task done   ";
		        String trimedString = stringWithspace.trim();
		        //System.out.println("Original String: '" + stringWithspace + "'");
		        System.out.println("Trimmed String: '" + trimedString + "'");
		        System.out.println("********************************");

		        // 8. startsWith() and endsWith() - Check if a string starts or ends with a specific prefix/suffix
		        boolean startsWithtask = s1.startsWith("task");
		        boolean endsWithcompleted = s1.endsWith("completed");
		        System.out.println("Starts with 'task': " + startsWithtask);
		        System.out.println("Ends with 'compledted': " + endsWithcompleted);
		        System.out.println("********************************");

		        // 9. split() - Split a string into an array of substrings
		        String[] words = s1.split(" "); // Split by space
		        System.out.println("Words in the string:");
		        for (String word : words) {
		            System.out.println(word);
		        }
		    }
		

	}


