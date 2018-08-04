package strings_and_dialogs;

import javax.swing.JOptionPane;

public class IKWYDLS {
	public static void main(String[]args) {
		
		String name=JOptionPane.showInputDialog("What is your name");
		
		JOptionPane.showMessageDialog(null, "I know that you went to Hawaii last summmer," + name);
	

}
}
