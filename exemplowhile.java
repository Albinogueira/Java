package Facul;

import javax.swing.JOptionPane;
public class exemplowhile { //par ou impar com while
	public static void main(String[] args) {
		int num, x;
		x=Integer.parseInt(JOptionPane.showInputDialog("Entre com a qtde de números"));
		int i=1;
		while (i<=x) {
			num=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
			if(num % 2== 0) {
				JOptionPane.showMessageDialog(null, num+" é par");
			} else {
				JOptionPane.showMessageDialog(null, num+" é impar");
			}
			i++; // incremento da variável
		}
	}
}
