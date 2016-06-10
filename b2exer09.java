package Facul;

/*9.	Desenvolva um algoritmo que calcule o número de grãos de trigo dispostos num tabuleiro 
com 16 quadros e que segue a seguinte regra: no primeiro quadro, colocar um grão de trigo; 
no segundo quadro, colocar o dobro de grãos de trigo do primeiro quadro; e, para todos os
 quadros subsequentes, colocar o dobro de grãos de trigo do quadro anterior.*/
import javax.swing.*;
public class b2exer09 {
	public static void main(String arga[]) {
		int num=16;
		trigo(num);
	}
	static void trigo(int n) { //procedimento
		int grao=1;
		for (int i=1;i<n;i++) {
			grao+=i*2;
		}
		JOptionPane.showMessageDialog(null,grao);
	} 
}
