package funcions;

import javax.swing.*;

import java.awt.event.*;

public class MenuPrincipal extends JFrame implements ActionListener {
	private JTextField textfield1;
	private JLabel label1;
	private JButton boton1, boton2;
	

	public MenuPrincipal() {
		
	}

	
	public void introduirdades() {
		setLayout(null);
		label1 = new JLabel("Escull la aplicació a executar");
		label1.setBounds(10, 10, 230, 30);
		add(label1);
		/*textfield1 = new JTextField();
		textfield1.setBounds(220, 15, 70, 20);
		add(textfield1);*/
		boton1 = new JButton("Calcular factorial");
		boton1.setBounds(220, 50, 160, 25);
		add(boton1);
		boton1.addActionListener(this);
		boton2 = new JButton("Compte bancari");
		boton2.setBounds(220, 80, 160, 25);
		add(boton2);
		boton2.addActionListener(this);
	}
	
	public static void main(String[] ar) {
		MenuPrincipal menu = new MenuPrincipal();
		menu.introduirdades();
		menu.setBounds(0, 0, 450, 200);
		menu.setVisible(true);
	}

	
	public void actionPerformed(ActionEvent e) {
		//String cad = textfield1.getText();
		//int quantitat = Integer.parseInt(cad);
		if (e.getSource() == boton1) {
			    CalculaFactorial f = new CalculaFactorial();
				//int num=7;
				f.introduirdades();
				f.setBounds(0, 0, 500, 160);
				f.setVisible(true);
				// System.out.println(f.calcfac(num));
		       }
		if (e.getSource() == boton2) {
			Compte formulario = new Compte("Client");
			formulario.introduirdades();
			formulario.setBounds(0, 0, 450, 200);
			formulario.setVisible(true);
		}
	}
}
