package Facul;

import javax.swing.*;
public class aula2e2 { //nome, sobrenome, idade, altura
	//public static void main (String args[]) {
	public void exibir() {
		String nome = "",sobrenome;
		int idade = 0;
		Float altura;
		nome=JOptionPane.showInputDialog(null,"Entre com o seu nome");
		sobrenome=JOptionPane.showInputDialog(null,"Entre com o seu sobrenome");
		idade=Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com sua idade"));
		altura=Float.parseFloat(JOptionPane.showInputDialog(null,"Entre com a sua altura"));
		JOptionPane.showMessageDialog(null, "Seu nome completo eh "+nome+" "+sobrenome+"\n Sua idade eh "+idade+" anos."+"\n Sua altura eh "+altura+"m");
		menu_aula2 as2=new menu_aula2();
        as2.exibir();
	}
}
