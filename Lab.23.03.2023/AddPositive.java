package JLab;

import java.util.Scanner;

public class AddPositive {
			
	public static int addTwoPositive(int a, int b) {
		   try {
	       if (a <= 0 || b <= 0) {
            throw new ArithmeticException("Non-positive integer sent");
		        } else {
	           return a + b;
		       }
			   } catch (ArithmeticException e) {
		       System.out.println(e.getMessage());
		       throw e;
		   } finally {
	        System.out.println("Finally block executed");
		    }
		 }
		public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("Enter two positive integers:");
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
		    int result = addTwoPositive(a, b);
		    System.out.println("Result: " + result);
		    scanner.close();
		}

	}
	

