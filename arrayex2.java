package Facul;

import javax.swing.*;
public class arrayex2 {
	public static void main(String arga[]) {
		int veta[]=new int[5];
		int vetb[]=new int[5];
		insere(veta);
		insere(vetb);
		soma(veta,vetb);
	}
	static void insere(int [] v1) { //procedimento
		for (int i=0;i<v1.length;i++) {
			v1[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número"));
		}
	}
	static void soma(int [] v1,int []v2) { //procedimento
		int vetc[]=new int[5];
		for (int i=0;i<vetc.length;i++) {
			vetc[i]=v1[i]+v2[i];
			System.out.println("A soma é: "+vetc[i]);
		}
	}
}
