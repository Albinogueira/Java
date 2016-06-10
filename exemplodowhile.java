package Facul;

import javax.swing.JOptionPane;
public class exemplodowhile {
	public static void main(String[] args) {
		int num, x;
		x=Integer.parseInt(JOptionPane.showInputDialog("Entre coma qtde de números (do while)"));
		int i=1;
		do {
			num=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
			if(num % 2== 0) {
				JOptionPane.showMessageDialog(null, num+" é par");
			} else {
				JOptionPane.showMessageDialog(null, num+" é impar");
			}
			i++; // incremento da variável
		} while (i<=x);
	}
}
