package Facul;

import javax.swing.*;
class exe06 {
	public void exibir() {
	//public static void main(String args[]) {
		Float salario_bruto, valor_hora; 
		int horas_trabalhadas; //definido como inteiro para facilitar o calculo
		valor_hora = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor da hora de trabalho:"));
		horas_trabalhadas = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite as horas trabalhadas"));
		salario_bruto = horas_trabalhadas * valor_hora;
		JOptionPane.showMessageDialog(null,"O valor a ser recebido eh de R$"+salario_bruto);
	} 
}
