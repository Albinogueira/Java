package Facul;

/*4.	Desenvolva um algoritmo que receba um número, calcule e mostre os resultados da 
 tabuada desse número.*/
import javax.swing.*;
public class b2exer04 {
	public static void main(String args[]) {
		int num;
		for(int i=0;i<5;i++) {
			num=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número para tabuada"));
			tabuada(num);
		}
	}
	static void tabuada(int n) {
		String tab="Tabuada do "+n+":\n";
		for(int i=1;i<=10;i++) {
			tab+=n+"x"+i+"="+(n*i)+"\n";
		}
		JOptionPane.showMessageDialog(null,tab);
	}
	
}
