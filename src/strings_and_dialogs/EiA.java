package strings_and_dialogs;

import javax.swing.JOptionPane;

public class EiA {
	public static void main(String[]args) {
		String name=JOptionPane.showInputDialog("What do you like");
		
		JOptionPane.showMessageDialog(null, name + " is awesome");

}
}
