package Facul;

import javax.swing.*;
class aula3e4 { //votar e dirigir
	public void exibir(){
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade"));
		if (idade<16) {
			JOptionPane.showMessageDialog(null,"Voce nao pode votar e nem dirigir");
		} else {
			if (idade>=18) {
				JOptionPane.showMessageDialog(null,"Voce pode dirigir e votar");
			} else {
				JOptionPane.showMessageDialog(null,"Voce pode votar, mas nao pode dirigir");
			}
		}
	}
}
