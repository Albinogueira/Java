package Facul;

import javax.swing.*;
public class arrayex3 {
	public static void main(String arga[]) {
		int veta[]=new int[5];
		int vetb[]=new int[5];
		int vetc[]=new int[5];
		insere(veta);
		insere(vetb);
		vetc=soma(veta,vetb);
		mostra(veta,vetb,vetc);
	}
	static void mostra(int [] v1,int [] v2, int [] v3) { //procedimento
	String mostra="";
		for(int i=0;i<v1.length;i++) {
			mostra+=v1[i]+"+"+v2[i]+"="+v3[i]+"\n";
		}
		JOptionPane.showMessageDialog(null,mostra);
	}
	static void insere(int [] v1) { //procedimento
		for (int i=0;i<v1.length;i++) {
			v1[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número"));
		}
	}
	static int [] soma(int [] v1,int []v2) { //funcao
		int v3[]=new int[5];
		for (int i=0;i<v3.length;i++) {
			v3[i]=v1[i]+v2[i];
		}
		return v3;
	}
}
