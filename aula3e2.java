package Facul;

import javax.swing.*;
class aula3e2 { //reajuste
	public void exibir(){
		float salario, reajustado;
		int anos;
		salario = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do salario"));
		anos = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o tempo na empresa"));
		if (anos>=5) {
			reajustado=salario*(float).15+salario;
		} else {
			reajustado=salario*(float).10+salario;
		}
		JOptionPane.showMessageDialog(null,"O salario reajustado \u00e9 R$"+reajustado);
	}
}

