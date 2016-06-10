package Facul;

import javax.swing.*;
public class aula7e3 { //imprime de n+1 a m-1
	public static void main(String a[ ] ){
		int num, n, m;
		n = Integer.parseInt(JOptionPane.showInputDialog("N:"));
		m = Integer.parseInt(JOptionPane.showInputDialog("M:"));
		for (num = n+1; num <= m-1; num++){
			System.out.println(num);
		}
	}
}
