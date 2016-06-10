package Facul;

import javax.swing.*;
public class calculo {
	public static void main (String args[]) {
		double d=0.0,b=2.2;
		int c=5,a=10,e;
		d=a * 10 * Math.pow(2,3) / c + (a / 2 * b);
		e = (int) d;
		JOptionPane.showMessageDialog(null, "O resultado da expressao eh de "+d+"   "+e);
		//JOptionPane.showMessageDialog(null, "A multiplicacao de "+n1+" , "+n2+" e "+n3+" resulta em "+n5);
	}
}
