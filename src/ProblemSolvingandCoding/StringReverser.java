package ProblemSolvingandCoding;

public class StringReverser {
	
	
	    public static String reverseString(String input) {
	        char[] characters = input.toCharArray(); // Convert string to character array
	        int left = 0;
	        int right = characters.length - 1;

	        // Swap characters from both ends moving towards the center
	        while (left < right) {
	            // Swap characters at left and right indices
	            char temp = characters[left];
	            characters[left] = characters[right];
	            characters[right] = temp;
	            
	            // Move towards the center
	            left++;
	            right--;
	        }

	        // Convert character array back to string
	        return new String(characters);
	    }

	    public static void main(String[] args) {
	        String input = "hello";
	        String reversed = reverseString(input);
	        System.out.println("Reversed string: " + reversed); // Output: "olleh"
	    }
	}



