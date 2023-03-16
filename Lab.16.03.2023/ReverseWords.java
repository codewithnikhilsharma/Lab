package Lab;

import java.util.Scanner;

public class ReverseWords {

	   public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("Enter a string: ");
	      String str = scanner.nextLine();
	      String reversedStr = reverseWords(str);
	      System.out.println("Reversed string: " + reversedStr);
	   }

	   public static String reverseWords(String str) {
	      StringBuilder reversedStr = new StringBuilder();
	      StringBuilder word = new StringBuilder();

	      for (int i = 0; i < str.length(); i++) {
	         char c = str.charAt(i);

	         if (c == ' ') {
	            reversedStr.append(word.reverse());
	            reversedStr.append(' ');
	            word.setLength(0);
	         } else {
	            word.append(c);
	         }
	      }

	      reversedStr.append(word.reverse());
	      return reversedStr.toString();
	   }
	}


