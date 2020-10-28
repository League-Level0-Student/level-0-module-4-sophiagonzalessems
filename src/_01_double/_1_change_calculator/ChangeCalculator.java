package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickle = JOptionPane.showInputDialog(null, "How many nickles do you have?");

		// Convert their answer to an int.   Hint: Integer.parseInt()  
		int nickleint=Integer.parseInt(nickle);
		// Ask the user how many dimes they have, and convert their answer
String dime= JOptionPane.showInputDialog(null,"How many dimes do you have?");
int dimeint=Integer.parseInt(dime);
		// Ask the user how many quarters they have, and convert their answer
String quarter= JOptionPane.showInputDialog(null,"How many quarters do you have?" );
int quarterint=Integer.parseInt(quarter);

		// Calculate how much money the user has.  Hint: Use a double variable 
double money= (nickleint*5+dimeint*10+quarterint*25)/100D;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
JOptionPane.showMessageDialog(null, "You have $"+money);
	}
}

