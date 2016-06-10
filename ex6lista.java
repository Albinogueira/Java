package Facul;

import javax.swing.*;
public class ex6lista {
	public static void main(String arga[]) {
		int n=0;
		double soma=1, j=0;
		n=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero"));
		for (int i=2;i<=n;i++) {
			j=fatorial(i);
			soma=soma+(1/j);			
		}
		JOptionPane.showMessageDialog(null,"A soma eh "+soma);
	}
	static int fatorial(int nn) {
		int calc=1;
		for (int i=1;i<=nn;i++) {
			calc=calc*i;
		}
		return calc;
	}
}
