package ProblemSolvingandCoding;

public class FizzBuzzPrime {
	
	    public static void main(String[] args) {
	        for (int i = 1; i <= 100; i++) {
	            if (isPrime(i)) {
	                System.out.println("Prime");
	            } else if (i % 3 == 0 && i % 5 == 0) {
	                System.out.println("FizzBuzz");
	            } else if (i % 3 == 0) {
	                System.out.println("Fizz");
	            } else if (i % 5 == 0) {
	                System.out.println("Buzz");
	            } else {
	                System.out.println(i);
	            }
	        }
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int num) {
	        if (num <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false; // Not prime if divisible by any number other than 1 and itself
	            }
	        }
	        return true;
	    }
	}



