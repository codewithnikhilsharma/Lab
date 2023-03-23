package JLab;

import java.util.Scanner;

public class Numbers {

	   public static void main(String[] args) {
	       Scanner input = new Scanner(System.in);
	       System.out.print("Enter No 1 : ");
	        int x = input.nextInt();
	        System.out.print("Enter No 2 : ");
	        int y = input.nextInt();
	        try {
	         if (x < 0 || y < 0) {
	      throw new Exception("x and y should not be negative.");
	      } else if (x == 0 || y == 0) {
	       throw new Exception("x and y should not be zero.");
	        } else {
	        int product = x * y;
	         System.out.println(product);
	         }
	        } catch (Exception e) {
	        System.out.println(e);
	        }
	    }
	}


