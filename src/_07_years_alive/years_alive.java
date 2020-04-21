package _07_years_alive;

import javax.swing.JOptionPane;

public class years_alive {
public static void main(String[] args) {
String bYea = JOptionPane.showInputDialog("What year where you born in. ex> 2000");
String yeaN = JOptionPane.showInputDialog("What year is it now. ex> 2000");	
int bYear = Integer.parseInt(bYea);
int yearN = Integer.parseInt(yeaN);
for (int i = bYear; i < yearN ; i++ ) {
System.out.print(i+ " ");	
}
System.out.print(yearN);
}
}
