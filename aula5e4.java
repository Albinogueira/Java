package Facul;

import java.text.*;
import java.math.*;
import javax.swing.*;
class aula5e4 {
	public void exibir() { // total de graos
//	public static void main(String args[]) {
		BigInteger grao,total;
		grao= new BigInteger("1");
		total=new BigInteger("0");
		String forma = "###,###.##";
		DecimalFormat decimalFormat = new DecimalFormat(forma);
		for (int i=1;i<65;i++){
			total=total.add(grao);
			System.out.println(i+"- grão: "+grao);
			grao=grao.multiply(new BigInteger("2"));
		}
		String num = decimalFormat.format(total);
		JOptionPane.showMessageDialog(null,"O total no tabuleiro é de: "+num+" grãos.");
	}
}
