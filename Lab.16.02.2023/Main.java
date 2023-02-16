package Now;

// Arithmetic class
class Arithmetic {
	
 // Define the add method that takes two integers as input and returns their sum
   int add(int num1, int num2){
     return num1 + num2;
 }
}

//Define the Adder class that inherits from the Arithmetic class
class Adder extends Arithmetic {
 }

    public class Main {
	 public static void main(String[] args) {
	     Adder myAdder = new Adder();
	     
	     // Call the add method on the Adder object, passing in two integer arguments
	     int result = myAdder.add(2, 3);
	     
	     // Print the result to the console
	     System.out.println("The sum is: " + result);
	 }
}
