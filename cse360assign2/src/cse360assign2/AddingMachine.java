/* @author Michael Park
 * @class ID: 70641
 * Assignment #2
 * This assignment's purpose is to help the students understand
 * version control. We are using github and learning how it's relationship
 * with eclipse can be useful.
 * 
 * At first we will be putting an incomplete code that has been provided by
 * the instructor to github. Then we will complete the code and push it again
 * onto the repository 
 */

package cse360assign2;

/**
 * This class does simple adding and subracting 
 * The methods they have is add, subtract, getting the total, and 
 * a toString methods.
 * These methods calculate transactions that the machine receives.
 */

public class AddingMachine {
	
	private int total;
	private String transactions;
	
	
	/**
	 * Default constructor for the AddingMachine class
	 * It sets the total into the integer value 0.
	 * It also sets the String transactions to 0.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		transactions = "0";
	}
	
	/**
	 * This method returns the total of the transactions.
	 * @postcondition returns the total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * This method adds the value that you get to the total
	 * It also updates the transaction history.
	 * @parameter An Integer value
	 * @postcondition Adds onto the current total value
	 * and updates the transaction string value
	 */
	public void add (int value) {
		total = total + value;
		transactions = transactions + " + " + value;
	}
	
	/**
	 * This method subtracts the value that you get to the total
	 * It also updates the transaction history.
	 * @parameter An Integer value
	 * @postcondition Subtracts from the current total value
	 * and updates the transaction string value
	 */
	public void subtract (int value) {
		total = total - value;
		transactions = transactions + " - " + value;
	}
	
	/**
	 * Returns the values stored in the transactions 
	 * as a string.
	 * @return a String of transactions
	 */
	public String toString () {
		return transactions;
	}
	
	/**
	 * This method clears the transactions and resets.
	 * @postcondition total and transaction becomes back to 0
	 */
	public void clear () {
		total = 0;
		transactions = "0";
	}
}