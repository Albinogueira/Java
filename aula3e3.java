package Facul;

import javax.swing.*;
public class aula3e3 { //media final
	public void exibir(){
		double mediafinal =0;
		mediafinal=Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com a sua media final"));
		if (mediafinal>=5){
			JOptionPane.showMessageDialog(null, "Aprovado");
		}else{
			if (mediafinal<3){
				JOptionPane.showMessageDialog(null, "Reprovado");
			}else{
				JOptionPane.showMessageDialog(null, "Exame");
			}
		}
	}
}
