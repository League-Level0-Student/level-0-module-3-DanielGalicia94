package _04_are_you_happy;

import javax.swing.JOptionPane;

public class Are_you_happy {
public static void main(String[] args) {
	String RUHappy = JOptionPane.showInputDialog("Are you happy?");
	if (RUHappy.contentEquals("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing what you're doing");
		} else {
		String Whant = JOptionPane.showInputDialog("Do you whant to be happy");
		if (Whant.contentEquals("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you're doing");
		} else {
		JOptionPane.showMessageDialog(null, "You need to change something");	
			}
		}
		}	
}

