package Facul;

import javax.swing.*;
public class aula2e1 { // nome e idade
	//public static void main (String args[]) {
    public void exibir() { // nome, idade
		String nome = "";
		int idade = 0;
		nome=JOptionPane.showInputDialog(null,"Entre com o seu nome");
		idade=Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com sua idade"));
		JOptionPane.showMessageDialog(null, "Seu nome é "+nome+"\n Sua idade é "+idade+" anos.");
		menu_aula2 as2=new menu_aula2();
		as2.exibir();
	}
}
