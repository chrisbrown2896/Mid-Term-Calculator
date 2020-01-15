
/**

 * @author Chris Brown

 * Creating a user input console calculator that allows the user to add, subtract

 * multiply, divide, modulo division, multiply to the power of, and getting the 

 * root of a number.

 */

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;

public class ConsoleCalculator {

		/**
		 * 
		 * @param firstnumber	 	user inputs first number to be calculated
		 * @param secondnumber	 	user inputs second number to be calculated
		 * @param operation 	 	user inputs which operation they want to be performed
		 * @return correct answer 	shows the solution to the calculation
		 */
		
		/**Setting variables*/
		private static double firstNumber = 0;
		private static double secondNumber = 0;
		private static double result = 0;
		private static Scanner scan = new Scanner(System.in);
		/** where the user will type in the numbers and operation they want to perform*/
		private static void getOperation() {
			System.out.print("Enter first number(if pi, type pi): ");
			firstNumber = getOperInput();
			System.out.print("Enter second number(if pi, type pi): ");
			secondNumber = getOperInput();
			
		}
		/**used for getting operator input and also checking for exceptions*/
		private static double getOperInput() {
			try{
				String input = scan.nextLine();
				if (input.equals("pi")) {
					return Math.PI;
				} else if (input.contentEquals("e")) {
					return Math.E;
				}
				return Double.parseDouble(input);
			} catch (InputMismatchException e) {
				System.out.println("This is not a correct entry, please try again");
			}
			catch (NumberFormatException e){
				System.out.println("Please enter a number or PI");
				return getOperInput();
			}
			return getOperInput();
			
			
		} 	
		
	/**main method*/
	public static void main(String []args) {
		
		String request = "";
		
		System.out.println("Type ON to start calculator!");
		
		do {
			request = scan.nextLine();
			request = request.toUpperCase().trim();
		} while (!request.contentEquals("ON"));
		
		System.out.println("Welcome!");
		
		do {
			
			System.out.print("Choose an operation(ADD, SUBTRACT, MULTIPLY, DIVIDE, MODULO, POWER, ROOT)");
			
			request = scan.nextLine();
			request = request.toUpperCase().trim();
		
			if(request.equals("ADD")){
				getOperation();
				result = Formulas.add(firstNumber, secondNumber);
				System.out.println(result);
			} else if(request.contentEquals("SUBTRACT")) {
				getOperation();
				result = Formulas.subtract(firstNumber, secondNumber);
				System.out.println(result);
			} else if(request.contentEquals("MULTIPLY")) {
				getOperation();
				result = Formulas.multiply(firstNumber, secondNumber);
				System.out.println(result);
			} else if(request.contentEquals("DIVIDE")) {
				getOperation();
				result = Formulas.divide(firstNumber, secondNumber);
				System.out.println(result);
			} else if(request.contentEquals("MODULO")) {
				getOperation();
				result = Formulas.modulo(firstNumber, secondNumber);
				System.out.println(result);
			} else if(request.contentEquals("POWER")) {
				getOperation();
				result = Formulas.power(firstNumber, secondNumber);
				System.out.println(result);
			} else if (request.contentEquals("ROOT")) {
				getOperation();
				result = Formulas.root(firstNumber, secondNumber);
				System.out.println(result);
			} else {
				System.out.println("Input not recognized!");
			}

		} while (!request.equals("OFF"));
			
		System.out.println("Have a great day!");

		scan.close();				

				

			
		

	}



}