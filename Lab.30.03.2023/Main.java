package ALab;

//Class to load and store integer values in an array
class ListLoader {
	private int[] arr; // Private instance variable to store integer array

	// Method to load integer values in the array
	public void loadList(int startNumber, int lastNumber) {
		arr = new int[lastNumber - startNumber + 1]; // Initialize array with specified size
		for (int i = 0; i < arr.length; i++) { // Loop to assign integer values to the array
			arr[i] = startNumber + i;
		}
	}

	// Method to return the integer array
	public int[] getArr() {
		return arr;
	}
}

//Main class to execute the program
public class Main {
	public static void main(String[] args) {
		ListLoader loader = new ListLoader(); // Instantiate ListLoader object

		long startTime = System.currentTimeMillis(); // Get the start time

		loader.loadList(0, 10000000); // Load integer values in the array

		long endTime = System.currentTimeMillis(); // Get the end time

		int[] arr = loader.getArr(); // Get the integer array

		// Print the time taken to load the array
		System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");

		// Printing the first 10 and last 10 elements of the array
		System.out.print("First 10 elements: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print("Last 10 elements: ");
		for (int i = arr.length - 10; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}


