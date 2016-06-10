package Facul;

import java.util.Random;
import javax.swing.*;
class aula5e1 {
	public void exibir(){
		int num =0;//Declaração de variáveis
		int soma=0;
		for (int i=0;i<5;i++){//Estrutura de Repetição
			num=Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com um numero inteiro"));//Entrada de Dados
			if (num%2==0){//Condição que verifica se o número é par
				soma=soma+num;
			}
		}
		JOptionPane.showMessageDialog(null, "A soma dos números pares digitados é "+soma);//Saída de dados
	}
}
