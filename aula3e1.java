package Facul;

import javax.swing.*;
public class aula3e1 { //maioridade
	public void exibir(){
		int idade = 0;
		idade=Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com a sua idade"));
		if (idade<18){
			JOptionPane.showMessageDialog(null, "Voc\u00ea \u00e9 menor de idade");
		}else{
			JOptionPane.showMessageDialog(null, "Voc\u00ea \u00e9 maior de idade");
		}
	}
}
