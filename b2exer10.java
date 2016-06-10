package Facul;

/*10.	Desenvolva um algoritmo que receba um número x calcule e mostre um número inteiro 
que mais se aproxima da raiz quadrada desse número x.*/
import javax.swing.*;
public class b2exer10 {
	public static void main(String arga[]) {
		int num=Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com um número"));
		raiz(num);
	}
	static void raiz(int n) {
		double total;
		total=(int) Math.sqrt(n);
		JOptionPane.showMessageDialog(null,"O inteiro que mais se aproxima\nda raiz quadrada do número "+n+"\né: "+total);
	}
	
}
