package Facul;

import javax.swing.JOptionPane;
public class exemplofor { // par ou impar com for
	public static void main(String[] args) {
		int num, x;
		x=Integer.parseInt(JOptionPane.showInputDialog("Entre com a qtde de números"));
		for(int i=1; i<=x; i++) {
			num=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
			if(num % 2== 0) {
				JOptionPane.showMessageDialog(null, num+" é par");
			} else {
				JOptionPane.showMessageDialog(null, num+" é impar");
			}
		}
	}
}
