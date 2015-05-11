package funcions;

import javax.swing.*;

import java.awt.event.*;

public class EdatPersona extends JFrame implements ActionListener  {
	private JLabel label;

	public void introduirdades() {
		setLayout(null);
		label = new JLabel("En construcció");
		label.setBounds(10, 10, 350, 30);
		add(label);
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
	
}
