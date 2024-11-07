package CodeOptimization;
	import java.util.ArrayList;
	import java.util.List;

	public class RemoveDuplicatesBruteForce {
	    public static int[] removeDuplicates(int[] array) {
	        List<Integer> result = new ArrayList<>();
	        
	        for (int i = 0; i < array.length; i++) {
	            boolean isDuplicate = false;
	            for (int j = 0; j < i; j++) {
	                if (array[i] == array[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            if (!isDuplicate) {
	                result.add(array[i]);
	            }
	        }
	        
	        // Convert list back to array
	        int[] uniqueArray = new int[result.size()];
	        for (int i = 0; i < result.size(); i++) {
	            uniqueArray[i] = result.get(i);
	        }
	        
	        return uniqueArray;
	    }

	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 1, 2, 4, 5};
	        int[] result = removeDuplicates(array);
	        for (int num : result) {
	            System.out.print(num + " ");
	        }
	    }
	}

	
	


