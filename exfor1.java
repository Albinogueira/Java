package Facul;

import javax.swing.*;
class exfor1 {
	public static void main (String arg[]) {
		int maior=0,menor=0,n=0;
		for (int i=0;i<5;i++) {
			n=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero:"));
			if (n>=maior) {
				maior=n;
			}
			if (n<=menor) {
				menor=n;
			}
			if (i==0) {
				menor=n;
				maior=n;
			}
		}
		JOptionPane.showMessageDialog(null,"O valor maior eh: "+maior+", e o valor menor eh: "+menor);
	}
}
