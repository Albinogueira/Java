package Facul;

import javax.swing.*;
class aula4e2 {
	public void exibir(){
		int escolha;
		String curso;
		escolha=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite:\n 1 - SI \n 2 - Redes \n 3 - Banco de Dados \n 4 - Web Designer \n 5 - Administracao \n 6 - Ci\u00eancia da Computa\u00e7\u00e3o"));
		switch (escolha) {
			case 1:
				curso="SI";
				break;
			case 2:
				curso="Redes";
				break;
			case 3:
				curso="Banco de Dados";
				break;
			case 4:
				curso="Web Designer";
				break;
			case 5:
				curso="Administra\u00e7\u00e3o";
				break;
			case 6:
				curso="Ci\u00eancia da Computa\u00e7\u00e3o";
				break;
			default:
				curso="Curso Inv\u00e1lido";
		}
		JOptionPane.showMessageDialog(null,"O curso escolhido foi "+curso);
	}
 }
