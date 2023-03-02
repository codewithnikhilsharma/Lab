package Lab;

import java.util.Scanner;

public class OddNumber {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Prompt the user to enter a number
	        System.out.print("Enter a number: ");
	        
	        // Read an integer from the user
	        int n = sc.nextInt();

	        // Calculate the sum of all odd numbers up to n
	        int sum = 0;
	        for (int i = 1; i <= n; i += 2) {
	            sum += i;
	        }

	        // Print the sum of odd numbers up to n
	        System.out.println("The sum of odd numbers up to " + n + " is : " + sum);
	    }
	}


