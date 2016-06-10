package Facul;

import javax.swing.*;
class exe03 {
	public void exibir() {
	//public static void main(String args[]) {
		Double lar,comp,area,peri;
		lar=Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com a largura do retangulo"));
		comp=Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com o comprimento do retangulo"));
		area=comp*lar;
		peri=2*comp+2*lar;
		JOptionPane.showMessageDialog(null,"O perimetro eh "+peri+" e a area eh "+area);
	}
}
