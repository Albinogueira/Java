package Facul;

import javax.swing.*;
public class aula4e1 {
	public void exibir(){
		int escolha=0;
		String estac=" ";
		escolha=Integer.parseInt(JOptionPane.showInputDialog(null, "Entre: \n 1 - Primavera; \n 2 - Ver\u00e3o; \n 3 - Outono; \n 4 - Inverno"));
		switch (escolha){
			case 1:
			estac="Primavera";
			break;
			case 2:
			estac="Ver\u00e3o";
			break;
			case 3:
			estac="Outono";
			break;
			case 4:
			estac="Inverno";
			break;
			default:
			estac="Estação Inválida";
		}
		JOptionPane.showMessageDialog(null, "A op\u00e7\u00e3o escolhida foi "+estac);
	}
}
