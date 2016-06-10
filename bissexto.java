package Facul;

import javax.swing.*;
class bissexto {
	public static void main(String args[]) {
		int ano;
		ano=Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com o ano"));
		if (ano%400==0) {
			JOptionPane.showMessageDialog(null,"O ano "+ano+" é bissexto");
		} else if ((ano % 4==0) && (ano % 100 !=0)){
			JOptionPane.showMessageDialog(null,"O ano "+ano+" é bissexto");
		} else {
			JOptionPane.showMessageDialog(null,"O ano "+ano+" não é bissexto");
		}
	}
}
