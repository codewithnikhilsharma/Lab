package NLab;

public class FindPairs {
   public static void main(String[] args) {
	 // define the input array
   int[] arr = {2, 4, 6, 8, 10}; 
    // specify the target sum
   int targetSum = 14;
 // loop through the array and check for pairs that add up to the target sum
  for (int i = 0; i < arr.length; i++) { // outer loop 
     for (int j = i+1; j < arr.length; j++) { // inner loop 
    	// check if the pair adds up to the target sum	 
    	 if (arr[i] + arr[j] == targetSum) { 
    		 // print the pair
     System.out.println(arr[i] + " and " + arr[j] + " = " + targetSum);
       }
    	 }
	    }
	  }
    }


