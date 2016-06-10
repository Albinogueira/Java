package Facul;

import javax.swing.*;
public class arrayex1 {
	public static void main(String arga[]) {
		int veta[] = new int[5];
		int vetb[] = new int[5];
		int vetc[] = new int[5];
		String mostra="";
		for (int i=0;i<veta.length;i++) {
			veta[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número para a"));
			vetb[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número para b"));
			vetc[i]=veta[i]+vetb[i];
		}
		for (int i=0;i<vetb.length;i++) {
			mostra+=veta[i]+"+"+vetb[i]+"="+vetc[i]+"\n";
		}
		JOptionPane.showMessageDialog(null,mostra);
	}
}
