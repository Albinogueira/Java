package Facul;

import javax.swing.*;
public class idade { //margem de idade entre 5 a 70
	public static void main (String args[]) {
		int idade;
		do {
			idade=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade"));
			if (idade<5 || idade>70) {
				JOptionPane.showMessageDialog(null,"Idade inválida: "+idade);
			}
		} while (idade <5 || idade >70);
		JOptionPane.showMessageDialog(null,"Idade válida: "+idade);
	}
}
