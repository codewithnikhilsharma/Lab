package Today;

public class Smallestnumber {
       
	     // creating method findSmallest
		  public static int findSmallest(int a, int b, int c) {
			  
		    int smallest = a;
		    
		    if (b < smallest) {
		      smallest = b;
		    }
		    
		    if (c < smallest) {
		      smallest = c;
		    }
		    
		    return smallest;
		  }

		  public static void main(String[] args) {
			  
			 // calling findSmallest method 
		    int result = findSmallest(55, 89, 70);
		    System.out.println("Smallest number is : " + result);
		  }
		}


