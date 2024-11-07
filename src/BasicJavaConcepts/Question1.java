package BasicJavaConcepts;

public class Question1 {

	public static void main(String[] args) {
		
		        String str1 = new String("example");
		        String str2 = new String("example");

		        // Using '==': checks if str1 and str2 refer to the same object in memory
		        System.out.println(str1 == str2);  // Output: false, as they are different objects

		        // Using '.equals()': checks if the content of str1 and str2 is the same
		        System.out.println(str1.equals(str2));  // Output: true, as the content is identical
		    }
		}

	


