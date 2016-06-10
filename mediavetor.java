package Facul;

import javax.swing.*;
public class mediavetor {
	public static void main(String arga[]) {
		double [] md=new double[8];
		double soma=0,media;
		for (int i=0;i<md.length;i++) {
			md[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a média"));
			soma+=md[i];
		}
		media=soma/md.length;
		JOptionPane.showMessageDialog(null,"A média da classe é: "+media);
	}
}
