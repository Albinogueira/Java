package Facul;

import javax.swing.*;
class exe08 {
	public void exibir() {
	//public static void main(String args[]) {
		int n1,n2,multiplo;
		n1=Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com um numero para n1"));
		n2=Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com um numero para n2"));
		if (n1>n2){
			multiplo=n1%n2;
			if (multiplo==0){
				JOptionPane.showMessageDialog(null,"O numero "+n1+" eh multiplo de "+n2);
			} else {
				JOptionPane.showMessageDialog(null,"O numero "+n1+" nao eh multiplo de "+n2);
			}
		}
		if (n1<n2){
			multiplo=n2%n1;
			if (multiplo==0){
				JOptionPane.showMessageDialog(null,"O numero "+n2+" eh multiplo de "+n1);
			} else {
				JOptionPane.showMessageDialog(null,"O numero "+n2+" nao eh multiplo de "+n1);
			}
		}
	}
}
