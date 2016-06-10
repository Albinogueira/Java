package Facul;

import javax.swing.*;
class exe04 {
	public void exibir() {
	//public static void main(String args[]) {
		Double hp,lp,ha,la,azulejo,hl,aa;
		hp=Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com a altura da parede"));
		lp=Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com a largura da parede"));
		ha=Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com a altura do azulejo"));
		la=Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com a largura do azulejo"));
		hl=hp*lp;
		aa=ha*la;
		azulejo=hl/aa;
		JOptionPane.showMessageDialog(null,"Eh necessario "+azulejo+" azulejos");
	}
}
