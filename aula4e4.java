package Facul;

 import javax.swing.*;
 class aula4e4 {
	public void exibir(){
		String basica="";
		int operacao,escolha = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite: \n 1 - Matem\u00e1tica B\u00e1sica \n 2 - Matem\u00e1tica Avan\u00e7ada"));
		switch (escolha) {
			case 1:
				escolha=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite: \n 1 - Adição \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão"));
				switch (escolha) {
					case 1: 
						basica="Adição";
						break;
					case 2: 
						basica="Subtração";
						break;
					case 3: 
						basica="Multiplicação";
						break;
					case 4: 
						basica="Divisão";
						break;
					default:
						basica="Inválida";
						break;
				}
			break;
			case 2:
				operacao=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite: \n 1 - Potenciação \n 2 - Raíz"));
				switch (operacao) {
					case 1: 
						basica="Potenciação";
						break;
					case 2: 
						basica="Raíz";
						break;
					default:
						basica="Inválida";
				}
			break;
			default:
				basica="Inválida";
		}
		JOptionPane.showMessageDialog(null,"A Opção escolhida foi "+basica);
	}
 }
