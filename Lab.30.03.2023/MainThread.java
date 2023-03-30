package ALab;

class LoaderThread implements Runnable {
	private int startNumber; // start number of the range
	private int lastNumber; // last number of the range
	private int[] array; // array to store the numbers

	// Constructor to initialize the instance variables
	public LoaderThread(int startNumber, int lastNumber, int[] array) {
		this.startNumber = startNumber;
		this.lastNumber = lastNumber;
		this.array = array;
	}

	// Method to be executed when thread is started
	@Override
	public void run() {
		// Load numbers into the array in the given range
		for (int i = startNumber; i <= lastNumber; i++) {
			array[i] = i;
		}
	}
}

public class MainThread {
	public static void main(String[] args) throws InterruptedException {
		int[] array = new int[100000001]; // Initialize array with size 100 lakh + 1
		LoaderThread thread1 = new LoaderThread(0, 50000000, array); // Thread 1 to load numbers in range 0 to 50 lakh
		LoaderThread thread2 = new LoaderThread(50000001, 100000000, array); // Thread 2 to load numbers in range 50
																				// lakh to 100 lakh
		Thread t1 = new Thread(thread1); // Create a new thread for thread 1
		Thread t2 = new Thread(thread2); // Create a new thread for thread 2

		long startTime = System.currentTimeMillis(); // Get the start time
		t1.start(); // Start thread 1
		t2.start(); // Start thread 2

		t1.join(); // Wait for thread 1 to finish
		t2.join(); // Wait for thread 2 to finish

		long endTime = System.currentTimeMillis(); // Get the end time
		long responseTime = endTime - startTime; // Calculate the response time

		System.out.println("Time taken to load array: " + responseTime + " milliseconds"); // Print the response time
	}
}


