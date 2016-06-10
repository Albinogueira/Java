package Facul;

import javax.swing.*;
class exe09 {
	public void exibir() {
	//public static void main(String args[]) {
		int senha;
		senha=Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com a senha"));
		if (senha==1234) {
			JOptionPane.showMessageDialog(null,"A senha digitada eh valida");
		} else {
			JOptionPane.showMessageDialog(null,"A senha digitada nao eh valida");
		}
	}
}
