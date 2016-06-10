package Facul;

import javax.swing.*;
class aula5e2 {
	public void exibir(){
		int num, maior=0, menor=999999;
		for (int i=0;i<10;i++){//Estrutura de Repetição
			num=Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com um número"));
			if (num > maior) {
				maior=num;
			}
			if (num < menor) {
				menor=num;
			}
		}
		JOptionPane.showMessageDialog(null,"O valor maior é: "+maior+" e o valor menor é: "+menor);
	}
}
