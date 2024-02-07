package Stringprograms;

public class word_repeatingcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
		        String inputString = "he is the legend  is the genius and he is the king of king";

		        // Convert the string to lowercase to make the count case-insensitive
		        inputString = inputString.toLowerCase();

		        // Split the string into words
		        String[] words = inputString.split("\\s+");

		        // Create an array to store counts
		        int[] wordCounts = new int[words.length];

		        // Initialize counts to 1 for each word
		        for (int i = 0; i < words.length; i++) {
		            wordCounts[i] = 1;
		        }

		        // Check for repeated words and update counts
		        for (int i = 0; i < words.length; i++) {
		            for (int j = 0; j < words.length; j++) {
		                if (words[i].equals(words[j])) {
		                    wordCounts[i]++;
		                    // Set count to 0 for the repeated word to avoid counting it again
		                   // wordCounts[j] = 0;
		                }
		            }
		        }

		        // Display the word counts for non-zero counts
		        for (int i = 0; i < words.length; i++) {
		            if (wordCounts[i] != 0) {
		                System.out.println(words[i]);
		            }
		        }
		    }
		

	}


