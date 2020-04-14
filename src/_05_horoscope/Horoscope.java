package _05_horoscope;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "I'm going to ask you you're star date");
String month = JOptionPane.showInputDialog("What month where you born in?");
String dayN = JOptionPane.showInputDialog("What day where you born in. (in number form ex 1)");
int day= Integer.parseInt(dayN);
if (((month.contentEquals("March"))&&(day >= 20))||((month.contentEquals("April"))&&(day <= 20))) {
JOptionPane.showMessageDialog(null, "Your horoscope is Aries");	
} else if (((month.contentEquals("April"))&&(day > 20))||((month.contentEquals("May"))&&(day < 21))) {
	JOptionPane.showMessageDialog(null, "Your horoscope is Taurus");	
	} else if (((month.contentEquals("May"))&&(day >= 21))||((month.contentEquals("June"))&&(day <= 20))) {
		JOptionPane.showMessageDialog(null, "Your horoscope is Gemini");	
	} else if (((month.contentEquals("June"))&&(day > 20))||((month.contentEquals("July"))&&(day < 23))) {
		JOptionPane.showMessageDialog(null, "Your horoscope is Cancer");	
	} else if (((month.contentEquals("July"))&&(day >= 23))||((month.contentEquals("Agust"))&&(day <= 23))) {
		JOptionPane.showMessageDialog(null, "Your horoscope is Leo");	
	} else if (((month.contentEquals("Agust"))&&(day > 23))||((month.contentEquals("September"))&&(day < 23))) {
		JOptionPane.showMessageDialog(null, "Your horoscope is Virgo");	
	} else if (((month.contentEquals("September"))&&(day >= 23))||((month.contentEquals("October"))&&(day <= 23))) {
		JOptionPane.showMessageDialog(null, "Your horoscope is Libra");	
	} else if (((month.contentEquals("October"))&&(day > 23))||((month.contentEquals("November"))&&(day < 22))) {
		JOptionPane.showMessageDialog(null, "Your horoscope is Scorpio");	
	} else if (((month.contentEquals("November"))&&(day >= 22))||((month.contentEquals("December"))&&(day <= 22))) {
		JOptionPane.showMessageDialog(null, "Your horoscope is Sagittarius");	
	} else if (((month.contentEquals("December"))&&(day > 22))||((month.contentEquals("January"))&&(day < 20))) {
		JOptionPane.showMessageDialog(null, "Your horoscope is Capricorn");	
	} else if (((month.contentEquals("January"))&&(day >= 20))||((month.contentEquals("February"))&&(day <= 18))) {
		JOptionPane.showMessageDialog(null, "Your horoscope is Aquarius");	
	} else if (((month.contentEquals("February"))&&(day > 18))||((month.contentEquals("March"))&&(day < 20))) {
		JOptionPane.showMessageDialog(null, "Your horoscope is Pisces");	
	} else {
		JOptionPane.showMessageDialog(null, "That's not a star date or you need to capitalize the first letter of the Month");
	}
}
}
