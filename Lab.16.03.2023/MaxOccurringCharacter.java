package Lab;

import java.util.Scanner;

public class MaxOccurringCharacter {
	
	   public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("Enter a string: ");
	      String str = scanner.nextLine();
	      char maxChar = getMaxOccurringChar(str);
	      System.out.println("The maximum occurring character in the string \"" + str + "\" is: " + maxChar);
	   }

	   public static char getMaxOccurringChar(String str) {
	      char[] charArray = str.toCharArray();

	      // Initialize variables to store the maximum occurring character and its frequency
	      char maxChar = ' ';
	      int maxFreq = 0;

	      // Loop through each character and find its frequency
	      for (int i = 0; i < charArray.length; i++) {
	         char ch = charArray[i];
	         int freq = 1;

	         // Check the frequency of this character in the remaining part of the string
	         for (int j = i + 1; j < charArray.length; j++) {
	            if (charArray[j] == ch) {
	               freq++;
	            }
	         }

	         // Update the maximum occurring character and its frequency
	         if (freq > maxFreq) {
	            maxChar = ch;
	            maxFreq = freq;
	         }
	      }
	      return maxChar;
	   }
	}

		  
		   
		


