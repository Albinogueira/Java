package Facul;

import javax.swing.*;
public class aula2e4 { // soma de tres numeros
	//public static void main (String args[]) {
	public void exibir() {
		int n1=0;
		int n2=0;
		int n3=0;
		int n4=0;
		int n5=0;
		n1=Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o primeiro numero"));
		n2=Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o segundo numero"));
		n3=Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o terceiro numero"));
		n4=n1+n2+n3;
		n5=n1*n2*n3;
		JOptionPane.showMessageDialog(null, "A soma de "+n1+" , "+n2+" e "+n3+" resulta em "+n4+"\nA multiplicacao de "+n1+" , "+n2+" e "+n3+" resulta em "+n5);
		//JOptionPane.showMessageDialog(null, "A multiplicacao de "+n1+" , "+n2+" e "+n3+" resulta em "+n5);
		menu_aula2 as2=new menu_aula2();
        as2.exibir();
	}
}
