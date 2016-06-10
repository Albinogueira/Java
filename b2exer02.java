package Facul;

/*2.	Desenvolva um algoritmo que receba um número inteiro, calcule e mostre o seu fatorial.*/
import javax.swing.*;
public class b2exer02 { //fatorial
	static int num;
//	public void exibir() {
	public static void main(String args[]) {
		num=Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com um número inteiro"));
		fatorial(num);
	}
	static void fatorial(int n) {
		int num1,num2=1;
		num1=n;
		for(int i=1;i<=n;i++) {
			num2=num2*num1;
			num1--;
		}
		JOptionPane.showMessageDialog(null,"O fatorial de "+n+" é "+num2);
	}
}
