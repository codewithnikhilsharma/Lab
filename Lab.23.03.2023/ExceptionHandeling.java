package JLab;

import java.util.Scanner;

public class ExceptionHandeling {

	 public static void main(String[] args) {
	        
		 // Creating Scanner object to take user input
	    Scanner scanner = new Scanner(System.in);
	        
	   System.out.println("Enter two integers to divide:");
	        
	      try {
	         // Reading two integers from user input
	         int x = scanner.nextInt();
	         int y = scanner.nextInt();
	            
	        // Dividing x by y and printing result
	       System.out.println(x/y);
	            
	      } catch (ArithmeticException e) {

	    	  System.out.println(e);
	            
	      } catch (Exception e) {
      // If input is not integer, InputMismatchException is thrown.
	         System.out.println(e);
	            
	      } finally {
	       // Closing Scanner 
	          scanner.close();
	        }
	    }
	}


