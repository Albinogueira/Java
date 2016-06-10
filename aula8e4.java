package Facul;

import javax.swing.*;
public class aula8e4 { // somatoria + quadrado
	public static void main(String args[]) {
		int soma=0;
		for (int i=0;i<=50;i++) {
			soma=soma+(i*i);
		}
		JOptionPane.showMessageDialog(null,"A somatória é: "+soma);
		int num;
      double quadrado;
      for(num =0; num<=50; num++) {
         quadrado = Math.pow(num, 2);
         System.out.println(num+" ao quadrado = "+quadrado);
      }

	}
}
