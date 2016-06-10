package Facul;

/*8.	Desenvolva um algoritmo que receba 100 números reais, verifique e mostre o maior
 e o menor número recebido.*/
 import javax.swing.*;
public class b2exer08 {
	static double maor=0.0,meor=999999.9,num;
	public static void main(String arga[]) {
		//double num;
		for (int i=1;i<=100;i++) {
			num=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número"));
			maior(num);
			menor(num);
		}
		JOptionPane.showMessageDialog(null,"O número maior é: "+maior(num)+"\nO número menor é: "+menor(num));
	}
	static double maior (double m) { // procedimento
		if ( m>maor) {
			maor=m;
		}
		return maor;
	}
	static double menor (double m) { // procedimento
			if (m<meor) {
			meor=m;
		}
		return meor;
	}
}
