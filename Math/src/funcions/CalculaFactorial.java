package funcions;

import javax.swing.*;

import java.awt.event.*;

public class CalculaFactorial extends JFrame implements ActionListener {
	private JButton botongo;
	private JTextField textfield1;
	private JLabel label;
	
	public void introduirdades() {
		setLayout(null);
		label = new JLabel("Digui de quin número vol calcular el factorial:");
		label.setBounds(10, 10, 350, 30);
		add(label);
		textfield1 = new JTextField();
		textfield1.setBounds(370, 15, 70, 20);
		add(textfield1);
		botongo = new JButton("Go");
		botongo.setBounds(220, 50, 60, 25);
		add(botongo);
		botongo.addActionListener(this);
	}
	
	public long calcfac (long n){

	     if (n<0){
	    	 System.out.println("No es pot calcular el factorial de un número negatiu");
	    	 return 0;
	     }else {
		 if (n==0)
			     return 1;
			else {
			    long resultat = n * calcfac(n-1);
			    return resultat;
			}
		}
		}

		/*
		 * double result; result=1; while (n>0) { result = result * n; n=n-1; }
		 * return result; }
		 */
	
	public void actionPerformed(ActionEvent e) {
		String cad = textfield1.getText();
		long num = Integer.parseInt(cad);
		if (e.getSource() == botongo) {
			this.info("El factorial de " + num + " es " + calcfac(num));
		}
	}
	
	public void info(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje, "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}
	
		public static void main(String[] args) {
			CalculaFactorial f = new CalculaFactorial();
			int num=7;
			System.out.println(f.calcfac(num));

		}

}
