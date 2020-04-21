
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "September 4th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String BDay = JOptionPane.showInputDialog("Who's birthday do you want to know?");
		// 3. Print out what the user typed
	System.out.print(BDay);	
		// 4. if user asked for "mom"
	if (BDay.contentEquals("mom")) {
			//print mom's birthday
		System.out.print(momsBirthday);	
	} else if (BDay.contentEquals("dad")) {
		// 5. if user asked for "dad"
			// print dad's birthday
		System.out.print(dadsBirthday);	
	} else if (BDay.contentEquals("Daniel")) {
		// 6. if user asked for your name
			// print myBirthday
		System.out.print(myBirthday);	
	}	else {
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		System.out.print("Sorry, i don't remember that person's birthday!");	
	}

	} 
}
