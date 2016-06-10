package Facul;

import javax.swing.*;
class Fibonacci{
public static void main (String args[]){
	String fibo=""; //linha nova
		for(int a=0, b=1, i=0; i<15; b+=a, a=b-a, i++) {
			// linha comentada para nao ficar mostrando na tela um por um
			//JOptionPane.showMessageDialog(null, a+ " ");
			fibo+=a+" "; // linha nova
		}  
		JOptionPane.showMessageDialog(null, fibo); // linha nova
		// linha comentada pois não é necessária
		//System.exit(0);
	}
}
