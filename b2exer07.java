package Facul;

/*7.	Desenvolva um algoritmo que receba um número inteiro N, calcule e mostre a série 
de Fibonacci até o seu N-ésimo termo. A série de Fibonacci é dada pela seguinte sequência: 
1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ... etc.*/
import javax.swing.*;
public class b2exer07 {
	public static void main(String args[]) {
		int m;
		m=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número inteiro:"));
		fibo(m);
	}
	static void fibo(int nn) { //procedimento
		int n=0,t=1,x=0;
		String tudo=n+","+t+",";
		while (x<nn) {
			if (nn==0) {
				JOptionPane.showMessageDialog(null,"Série Fibonacci é: 0");
				break;
			}
			if (nn==1) {
				JOptionPane.showMessageDialog(null,"Série Fibonacci é: 1");
				break;
			}
			x=n+t;
			if (x>nn) {
				tudo=tudo+x+".";
			} else {
			tudo=tudo+x+",";
		}
			n=t;
			t=x;
		}
		JOptionPane.showMessageDialog(null,"O resultado para a série fibonacci é\n"+tudo);
	}
}
