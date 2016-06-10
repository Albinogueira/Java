package Facul;

import javax.swing.*;
class exe02 {
	public void exibir() {
	//public static void main(String args[]) {
		int hora, minuto, segundos, seg;
		hora=Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com as horas"));
		minuto=Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com os minutos"));
		segundos=Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com os segundos"));
		seg=((hora*60)*60)+(minuto*60)+segundos;
		JOptionPane.showMessageDialog(null,"o valor em segundos eh "+seg);
	}
}
