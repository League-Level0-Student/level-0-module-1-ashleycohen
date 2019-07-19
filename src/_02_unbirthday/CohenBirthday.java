package _02_unbirthday;

import javax.swing.JOptionPane;

public class CohenBirthday {
public static void main(String[] args) {
	String birthday = JOptionPane.showInputDialog(null, "When is your birthday?(mm/dd)");
	if (birthday.equals("07/19")) {
		JOptionPane.showMessageDialog(null, "Happy birthday!");
	}
}
}
