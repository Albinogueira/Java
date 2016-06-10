package Facul;

import javax.swing.*;
public class matem { // menu com resultados mostrados
	public static void main (String args[]) {
		int op,n1=0,n2=0;
		float res=0;
		do {
			op=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a opção: "+
			"\n1 - Soma"+
			"\n2 - Subtração"+
			"\n3 - Multiplicação"+
			"\n4 - Divisão"+
			"\n0 - Sair"));
			if (op >=1 || op <=4) {
				n1=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro número"));
				n2=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo número"));
			}
			switch (op) {
				case 1:
					res=n1+n2;
					break;
				case 2:
					res=n1-n2;
					break;				
				case 3:
					res=n1*n2;
					break;				
				case 4:
					res=n1/ (float)n2;
					break;			
				case 0:
					break;
				default:
					JOptionPane.showMessageDialog(null,"Opção Inválida!!");
			}
			if (op >=1 || op <=4) {
				JOptionPane.showMessageDialog(null,"Resultado: "+res);
			}
		} while (op!=0);
	}
}
