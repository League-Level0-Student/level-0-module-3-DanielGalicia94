//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot dan = new Robot();
		dan.setPenWidth(10);
		dan.penDown();
		dan.setSpeed(100);
		int sides = 3;
		int lenght = 0;
		for (int i = 0; i < 90; i++) {
			
		
		/*3. Ask the user what color they would like the robot to draw
	String color = JOptionPane.showInputDialog("What color do you want your robot");
		//5. Use an if/else statement to set the pen color that the user requested
	if (color.equals("red")) {
		dan.setPenColor(255, 0, 0);
	} else if (color.equals("green")){
		dan.setPenColor(0,255, 0);
	} else if (color.equals("blue")) {
		dan.setPenColor(0, 0, 255);
	} else if (color.equals("yellow")) {
		dan.setPenColor(255, 255, 0);
	} else if (color.equals("purple")) {
		dan.setPenColor(255, 0, 255);
	} else if (color.equals("orange")) {
		dan.setPenColor(255, 165, 0);
	} else if (color.equals("white")) {
		dan.setPenColor(255, 255, 255);
	} else if (color.equals("black")) {
		dan.setPenColor(0, 0, 0);
	} else if (color.equals("")) {
	    dan.setRandomPenColor(); 
        //6. If the user doesn’t enter anything, choose a random color
	} else {
		JOptionPane.showMessageDialog(null, "I don't recognise the color");
	} */
			dan.setRandomPenColor();
		
		for (int j = 0; j < sides; j++) {
		dan.turn(360/sides);
		dan.move(50);
		}
		sides ++;
		lenght = lenght*2;
		
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}}
}
