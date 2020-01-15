
/**
 * 
 * @author Chris Brown
 * This class contains all the formulas for the calculator. 
 */
	
	
public class Formulas {
	
	private static double numberResult = 0;
	
	/**Formula for addition
	 * @return */

	public static double add(double firstNumber, double secondNumber){
		numberResult = firstNumber + secondNumber;
		return numberResult;
	}
	
	/**Formula for subtraction*/
	public static double subtract(double firstNumber, double secondNumber){
		numberResult = firstNumber-secondNumber;
		return numberResult;
	}
	
	/**Formula for multiplication*/
	public static double multiply(double firstNumber, double secondNumber){
		numberResult = firstNumber*secondNumber;
		return numberResult;
	}
	/**Formula for division*/
	public static double divide(double firstNumber, double secondNumber){
		if (secondNumber == 0) {
			System.out.println("Unable to divide by zero");
			numberResult = 0;
			return numberResult;
		} else {
		numberResult = firstNumber/secondNumber;
		return numberResult;
		}
	}
	/**Formula for division with a remainder*/
	public static double modulo(double firstNumber, double secondNumber){
		numberResult = firstNumber%secondNumber;
		return numberResult;
	}
	/**Formula for number to the power of*/
	public static double power(double firstNumber, double secondNumber){
		numberResult = Math.pow(firstNumber, secondNumber);
		return numberResult;
	}
	/**Formula for getting the root of a number*/
	public static double root(double firstNumber, double secondNumber){
		numberResult = Math.pow(firstNumber, (1/secondNumber));
		return numberResult;
	}
	
			

		

	

	

}


