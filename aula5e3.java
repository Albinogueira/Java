package Facul;

import javax.swing.*;
public class aula5e3 {
	public void exibir(){
		int num=0;
		int cont=0;
		for (int i=0;i<10;i++){
			num=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o "+(i+1)+"º número"));
			if (num%2==0 && num%3==0){
				cont++;
			}
		}
		JOptionPane.showMessageDialog(null, "Dos 10 números digitados, "+cont+" são divisíveis por 2 E 3");
	}
}
