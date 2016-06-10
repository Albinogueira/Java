package Facul;

import javax.swing.*;
public class boi {
	public static void main(String arga[]) {
		float gordo=0,peso;
		for (int i=1; i<=10;i++) {
			peso=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o peso do boi"));
			if (gordo<peso) {
				gordo=peso;
			}
		}
		JOptionPane.showMessageDialog(null,"O peso do boi mais gordo é: "+gordo+" Kg");
	}
}
