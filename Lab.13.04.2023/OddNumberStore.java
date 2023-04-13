package Collection;

import java.util.ArrayList;

public class OddNumberStore {
    
    private ArrayList<Integer> A1; 
    private ArrayList<Integer> A2; 
    
    // Method to store odd numbers from 2 to N in ArrayList A1
    public ArrayList<Integer> storeOddNumbers(int N) {
        A1 = new ArrayList<Integer>(); // initialize ArrayList A1
        for (int i = 3; i <= N; i += 2) { // loop through odd numbers from 3 to N
            A1.add(i); // add odd number to ArrayList A1
        }
        return A1; // return ArrayList A1
    }
    
    // Method to print odd numbers in format 5, 15, 25, ..., 
    public ArrayList<Integer> printOddNumbers() {
        A2 = new ArrayList<Integer>(); // initialize ArrayList A2
        int multiplier = 5; // initialize multiplier to 5
        for (int i = 0; i < A1.size(); i++) { 
            int product = A1.get(i) * multiplier; 
            A2.add(product); // add product to ArrayList A2
            multiplier += 5; // increment multiplier by 5
        }
        System.out.println("Odd numbers multiplied by 5: " + A2); // print ArrayList A2
        return A2; // return ArrayList A2
    }
    
    // Method to retrieve odd number from ArrayList A1
    public int retrieveOddNumber(int N) {
        if (A1.contains(N)) { 
            return N; 
        } else {
            return 0; 
        }
    }
    
    public static void main(String[] args) {
        OddNumberStore handler = new OddNumberStore(); 
        ArrayList<Integer> A1 = handler.storeOddNumbers(15); // call storeOddNumbers method with parameter 15
        ArrayList<Integer> A2 = handler.printOddNumbers(); // call printOddNumbers method
        int num = handler.retrieveOddNumber(7); // call retrieveOddNumber method with parameter 7
        System.out.println("Odd number retrieved from A1: " + num); // print retrieved odd number
    }
}



