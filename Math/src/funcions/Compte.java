package funcions;

import javax.swing.*;
import java.awt.event.*;

public class Compte extends JFrame implements ActionListener {
	private JButton boton1, boton2;
	private JTextField textfield1;
	private JLabel label1, resultat;
	private String owner;
	private int balans;

	public Compte(String ownerparam) {
		this.owner = ownerparam;
		this.balans = 0;
	}

	public void introduirdades() {
		setLayout(null);
		label1 = new JLabel("Indiqui quantitat a ingressar/retirar:");
		label1.setBounds(10, 10, 200, 30);
		add(label1);
		textfield1 = new JTextField();
		textfield1.setBounds(220, 15, 70, 20);
		add(textfield1);
		boton1 = new JButton("Ingressar");
		boton1.setBounds(220, 50, 110, 25);
		add(boton1);
		boton1.addActionListener(this);
		boton2 = new JButton("Retirar");
		boton2.setBounds(220, 80, 110, 25);
		add(boton2);
		boton2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		String cad = textfield1.getText();
		int quantitat = Integer.parseInt(cad);
		if (e.getSource() == boton1) {
			this.deposit(quantitat);
		}
		if (e.getSource() == boton2) {
			this.withdraw(quantitat);
		}
		this.info("El saldo del cliente " + this.owner + " es de "
				+ this.balans + " €");
	}

	public void info(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje, "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void deposit(int amount) {
		if (amount > 0) {
			this.balans += amount;
		} else {
			this.info("la quantitat a ingressar ha de ser positiva");
		}
	}

	public void withdraw(int amount) {
		if (amount <= 0) {
			this.info("només pot retirar quantitats positives!");
		} else if (this.balans >= amount) {
			this.balans -= amount;
		} else {
			this.info("saldo insuficient!");
		}
	}

	public static void main(String[] ar) {
		Compte formulario = new Compte("Client");
		formulario.introduirdades();
		formulario.setBounds(0, 0, 450, 200);
		formulario.setVisible(true);
	}
}
