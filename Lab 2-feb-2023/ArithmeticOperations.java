package Object;

public class ArithmeticOperations {
   
//	// Write a Java program to print the sum (addition), multiply, subtract, divide and
//	remainder of two numbers.
//	Test Data:
//	Input first number: 125
//	Input second number: 24
	
	public static void main(String[] args) {
		
             // inputs values 
			    int num1 = 125;
			    int num2 = 24;
                
			    // Expression
			    int sum = num1 + num2;
			    int subtract = num1 - num2;
			    int multiply = num1 * num2;
			    int divide = num1 / num2;
			    int remainder = num1 % num2;
                
			    // for output
			    System.out.println("Sum: " + sum);
			    System.out.println("Difference: " + subtract);
			    System.out.println("multiply: " + multiply);
			    System.out.println("divide: " + divide);
			    System.out.println("Remainder: " + remainder);
			  }
	   }

