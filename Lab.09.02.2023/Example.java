package Today;
// create a Example class
public class Example {
      
	// instance variables
		  int a;
		  int b;

		  Example(int aValue, int bValue) {
		    a = aValue;
		    b = bValue;
		  }
		  
          // Method
		  int add() {
		    return a + b;
		  }
		  
		  public static void main(String[] args) {
			  // Creating object
		    Example obj = new Example(10, 20);
		    int result = obj.add();

		    System.out.println("Result: " + result);
		  }
		}


