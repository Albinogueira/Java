package Facul;

import javax.swing.*;
public class exe10 {
	public void exibir() {
	//public static void main(String args[]) {
		String invest;
		Double valor,corrigido;
		invest=JOptionPane.showInputDialog(null,"Qual o investimento? P(poupanca)/R(fundo de renda fixa");
		valor=Double.parseDouble(JOptionPane.showInputDialog(null,"Valor a ser investido"));
		switch (invest){
			case "P": case "p":
			corrigido=valor+(valor*0.003);
			JOptionPane.showMessageDialog(null,"O valor investido em Poupanca foi corrigido para R$"+corrigido);
			break;
			case "R": case "r":
			corrigido=valor+(valor*0.005);
			JOptionPane.showMessageDialog(null,"O valor investido em Renda Fixa foi corrigido para R$"+corrigido);
			break;
		}
	}
}
