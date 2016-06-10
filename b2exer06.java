package Facul;

/*Desenvolva um algoritmo que receba um número N, calcule e mostre o valor da seguinte série:
 Série = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!.*/
 import javax.swing.*;
 public class b2exer06 {
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
