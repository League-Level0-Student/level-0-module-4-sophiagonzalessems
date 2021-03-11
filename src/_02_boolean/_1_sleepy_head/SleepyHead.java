package _02_boolean._1_sleepy_head;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	private static String test;


	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
        String day= JOptionPane.showInputDialog("What day is it?");
		// Set the boolean isWeekend based on the value they enter
        if (day.equals("Saturday") || day.equals("Sunday")) {
			isWeekend=true; 
			JOptionPane.showMessageDialog(null,"You can sleep in");
		}
        else JOptionPane.showMessageDialog(null, "Get out of bed and go to school!");
		// If it is the weekend, tell the user they get to sleep in.
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
	String test = JOptionPane.showInputDialog("What did you score on your test?");
	int testasint=Integer.parseInt(test);
	if(testasint>70) {
	JOptionPane.showMessageDialog(null, "Congrats you pased the test!");
	}
	
	else {
		JOptionPane.showMessageDialog(null, "Good luck next time.");
	}
		
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		
		// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes")) {
				gameIsOver = true;
			JOptionPane.showMessageDialog(null,"game is over");
			}
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed=false;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String color=JOptionPane.showInputDialog("What color do you want to draw with?");
		if(color.equals("Red")) {
			isRed=true;
		}
		
			
		
		
		
	
		
	
	boolean isSquare=false;	
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		
		String shape= JOptionPane.showInputDialog("What shape do you want to draw?");
		if(shape.equals("Square")) {
			isSquare=true;
		}
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
	if (isRed&&isSquare) {
		drawRedSquare();
		
	}

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		rob.setSpeed(100);
		rob.penDown();
		rob.setPenColor(Color.red);
		for(int i=0; i<4; i++) {
		
		rob.move(100);
		rob.turn(90);
		}
		
		
		// Complete the rest of this method
	}	
}
