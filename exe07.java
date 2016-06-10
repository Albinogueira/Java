package Facul;

import javax.swing.*;
class exe07 {
	public void exibir() {
	//public static void main(String args[]) {
		int x1,x2,x3,y1,y2,y3,z,z1,z2,z3;
		x1=Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com um numero entre 0 e 9 para x1"));
		x2=Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com um numero entre 0 e 9 para x2"));
		x3=Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com um numero entre 0 e 9 para x3"));
		y1=Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com um numero entre 0 e 9 para y1"));
		y2=Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com um numero entre 0 e 9 para y2"));
		y3=Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com um numero entre 0 e 9 para y3"));
		z1=(x1*y1)%10;
		z2=(x2*y2)%10;
		z3=(x3*y3)%10;
		z=z1*z2*z3;
		JOptionPane.showMessageDialog(null,"O valor de Z eh igual a "+z);
	}
}
