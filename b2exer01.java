package Facul;

/*Desenvolva um algoritmo que calcule e mostre o quadrado dos números inteiros
compreendidos entre 10 e 150.*/
import javax.swing.*;
public class b2exer01 {
	public static void main(String args[]) {
//		int num;
//		num=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número inteiro"));
		quadrado();
	}
	static void quadrado() {
		String tab="Quadrado entre 10 e 150\n";
		int quad=0;
		for(int i=10;i<=150;i++) {
			quad=i*i;
			tab+=quad+"\n";
		}
//		JOptionPane.showMessageDialog(null,tab);
		System.out.println(tab);
	}
	
}
