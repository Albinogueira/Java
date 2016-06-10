package Facul;

import javax.swing.*;
class exe05 {
	public void exibir() {
	//public static void main(String args[]) {
		Double total,constr,mqc=5.00,mqnc=3.80,imposto;
		total=Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com a metragem do terreno"));
		constr=Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com a area contruida"));
		imposto=((total-constr)*mqnc)+constr*mqc;
		JOptionPane.showMessageDialog(null,"O valor do imposto a ser pago eh "+imposto);
	}
}
