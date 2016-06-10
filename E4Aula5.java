package Facul;

import javax.swing.*;
import java.text.*;
public class E4Aula5{
	public static void main (String args[]){
		double soma=0;
		String forma = "###,###.##";
		DecimalFormat decimalFormat = new DecimalFormat(forma);
		for (int i=0;i<64;i++){
			soma=soma+(Math.pow(2,i));			
		}
		String num = decimalFormat.format(soma);
		JOptionPane.showMessageDialog(null, "O total de grãos é "+num);
	}
}
