package Facul;

import javax.swing.*;
public class aula2e3 { //soma de dois numeros
	//public static void main (String args[]) {
	public void exibir() {
		int n1=0;
		int n2=0;
		int n3=0;
		n1=Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o primeiro numero"));
		n2=Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o segundo numero"));
		n3=n1+n2;
		JOptionPane.showMessageDialog(null, "A soma de "+n1+" e "+n2+" resulta em "+n3);
		menu_aula2 as2=new menu_aula2();
        as2.exibir();
	}
}
