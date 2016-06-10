package Facul;

import javax.swing.*;
public class exe01 {
	public void exibir() {
	//public static void main(String args[]) {
		Double dolar,real,cotacao;
		dolar=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor em dolar"));
		cotacao=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a cotacao do dia"));
		real=dolar*cotacao;
		JOptionPane.showMessageDialog(null,"O valor convertido em Real eh R$"+real);
	}
}
